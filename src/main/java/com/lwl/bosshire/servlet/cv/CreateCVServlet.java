package com.lwl.bosshire.servlet.cv;

import com.lwl.bosshire.pojo.CV;
import com.lwl.bosshire.pojo.CVWithBLOBs;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 23:11
 */
@WebServlet("/api/cv/create")
public class CreateCVServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        CVWithBLOBs cv = CVWithBLOBs.builder().cvFullName(req.getParameter("name"))
            .cvSex(Integer.parseInt(req.getParameter("sex")))
            .cvPhone(req.getParameter("headimage"))
            .cvBirth(req.getParameter("birth"))
            .cvEmail(req.getParameter("email"))
            .cvWxid(req.getParameter("wxid"))
            .cvPersonalSkill(req.getParameter("personal_skill"))
            .cvHopeCareer(req.getParameter("hope_career"))
            .cvWorkExp(req.getParameter("work_exp"))
            .cvProjectExp(req.getParameter("project_exp"))
            .cvStudyExp(req.getParameter("study_exp")).build();


    }
}
