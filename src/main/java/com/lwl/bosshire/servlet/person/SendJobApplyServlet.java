package com.lwl.bosshire.servlet.person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.17 8:56
 */
@WebServlet("/api/personal/jobapply/send")
public class SendJobApplyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int careerId = Integer.parseInt(req.getParameter("career_id"));
        int cvid = Integer.parseInt(req.getParameter("cvid"));

    }
}
