package com.lwl.bosshire.servlet.career;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.service.company.CompanyBasicService;
import com.lwl.bosshire.vo.CareerVo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.lwl.bosshire.utils.ResponseUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 15:37
 */
@WebServlet("/api/company/career/detail")
public class CareerDetailServlet extends HttpServlet {

    private final CompanyBasicService companyBasicService = CompanyBasicService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        ServiceResponse<CareerVo> res = companyBasicService.careerDetail(id);

        PrintWriter pw = resp.getWriter();
        if(res.isSuccess()) {
            success(pw);
        } else {
            failure(res.code(), pw);
        }
    }
}
