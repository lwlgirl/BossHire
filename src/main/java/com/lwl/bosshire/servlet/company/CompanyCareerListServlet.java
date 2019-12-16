package com.lwl.bosshire.servlet.company;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.service.company.CompanyBasicService;
import com.lwl.bosshire.vo.CareerListVo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.lwl.bosshire.common.ResponseMessage.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 15:32
 * 获取当前公司职位列表
 */
@WebServlet("/api/company/career/list")
public class CompanyCareerListServlet extends HttpServlet {

    private final CompanyBasicService companyBasicService = CompanyBasicService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter pw = resp.getWriter();
        ServiceResponse<CareerListVo> res = companyBasicService.companyCareerList();
        if(!res.isSuccess()) {
            pw.write(buildString(res.code(), "FAILURE"));
            return;
        }

        pw.write(buildString(0, "SUCCESS", res.data()));
    }
}
