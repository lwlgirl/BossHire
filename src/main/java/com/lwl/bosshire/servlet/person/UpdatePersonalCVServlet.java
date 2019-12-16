package com.lwl.bosshire.servlet.person;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.pojo.CVWithBLOBs;
import com.lwl.bosshire.service.cv.CVService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.lwl.bosshire.utils.ResponseUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 23:11
 * 求职者添加或修改简历
 */
@WebServlet("/api/personal/cv/create")
public class UpdatePersonalCVServlet extends HttpServlet {

    private final CVService cvService = CVService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        CVWithBLOBs cv = CVWithBLOBs.builder().cvFullName(req.getParameter("name"))
            .cvSex(Integer.parseInt(req.getParameter("sex")))
            .cvPhone(req.getParameter("phone"))
            .cvBirth(req.getParameter("birth"))
            .cvEmail(req.getParameter("email"))
            .cvWxid(req.getParameter("wxid"))
            .cvHeadImage(req.getParameter("head_image"))
            .cvPersonalSkill(req.getParameter("personal_skill"))
            .cvHopeCareer(req.getParameter("hope_career"))
            .cvWorkExp(req.getParameter("work_exp"))
            .cvProjectExp(req.getParameter("project_exp"))
            .cvStudyExp(req.getParameter("study_exp")).build();

        ServiceResponse<Void> res = cvService.insertPersonalCV(cv);
        PrintWriter pw = resp.getWriter();

        if(res.isSuccess()) {
            success(pw);
        } else {
            failure(res.code(), pw);
        }
    }
}
