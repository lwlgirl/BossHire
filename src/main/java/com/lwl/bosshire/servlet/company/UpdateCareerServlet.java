package com.lwl.bosshire.servlet.company;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.pojo.Career;
import com.lwl.bosshire.service.company.CompanyBasicService;
import lombok.extern.log4j.Log4j;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.lwl.bosshire.utils.ResponseUtils.*;
/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 8:25
 */
@Log4j
@WebServlet("/api/company/career/update")
public class UpdateCareerServlet extends HttpServlet {

    private final CompanyBasicService companyBasicService = CompanyBasicService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter pw = resp.getWriter();
        String oper = req.getParameter("oper");
        if ("delete".equals(oper)) {
            int id = Integer.parseInt(req.getParameter("id"));
            ServiceResponse<Void> res = companyBasicService.deleteCareer(id);
            if(res.isSuccess()) {
                success(pw);
                return;
            }

            failure(res.code(), pw);
        }

        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String salaryMin = req.getParameter("salary_min");
        String salaryMax = req.getParameter("salary_max");
        String desc = req.getParameter("desc");

        Career career = Career.builder()
                .careerName(name)
                .careerType(Integer.parseInt(type))
                .careerSalaryMin(salaryMin != null ? Integer.parseInt(salaryMin) : null)
                .careerSalaryMax(salaryMin != null ? Integer.parseInt(salaryMax) : null)
                .careerDesc(desc)
                .build();

        if ("add".equals(oper)) {
            ServiceResponse<Void> res = companyBasicService.addCareer(career);
            if(res.isSuccess()) {
                success(pw);
            } else {
                failure(res.code());
            }
        } else if ("update".equals(oper)) {
            int id = Integer.parseInt(req.getParameter("id"));
            career.setCareerId(id);
            ServiceResponse<Void> res = companyBasicService.updateCareer(career);
            if(res.isSuccess()) {
                success(pw);
            } else {
                failure(res.code());
            }
        } else {
            resp.sendError(403);
        }
    }
}
