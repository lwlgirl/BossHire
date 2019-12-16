package com.lwl.bosshire.servlet.pub;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.pojo.CVWithBLOBs;
import com.lwl.bosshire.service.cv.CVService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.lwl.bosshire.utils.ResponseUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 16:00
 * 公司查看投递的简历/个人查看投递的简历
 */
@WebServlet({"/api/company/cv/view", "/api/personal/cv/view"})
public class ViewCVDetailServlet extends HttpServlet {

    private final CVService cvService = CVService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int cvid = Integer.parseInt(req.getParameter("id"));
        ServiceResponse<CVWithBLOBs> res = cvService.showCVDetail(cvid);
        PrintWriter pw = resp.getWriter();
        if(res.isSuccess()) {
            success(res.data(), pw);
        } else {
            failure(res.code());
        }
    }
}
