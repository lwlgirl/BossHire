package com.lwl.bosshire.servlet.cv;

import com.lwl.bosshire.pojo.CV;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 23:11
 */
@WebServlet("/api/cv/create")
public class CreateCVServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        /*CV.builder().cvFullName(req.getParameter("name"))
            .cvSex(Integer.parseInt(req.getParameter("sex")))
                .cvPhone(req.getParameter("headimage"))
            .cvBirth(req.getParameter("birth"))
            .cvEmail(req.getParameter("email"))
            .cvWxid(req.getParameter("wxid"))
                .cvEmail(req.getParameter("email"));
        req.getParameter("phone");
        req.getParameter("birth");
        req.getParameter("email");
        req.getParameter("wxid");

        req.getParameter("personal_skill");
        req.getParameter("hope_career");
        req.getParameter("work_exp");
        req.getParameter("project_exp");
        req.getParameter("study_exp");*/

    }
}
