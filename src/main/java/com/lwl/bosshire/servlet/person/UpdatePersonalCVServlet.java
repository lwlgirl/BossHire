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
        String s;
        CVWithBLOBs cv = new CVWithBLOBs();
        cv.setCvId((s = req.getParameter("id")) != null ? Integer.parseInt(s) : null);
        cv.setCvFullName(req.getParameter("name"));
        cv.setCvSex((s = req.getParameter("sex")) != null ? Integer.parseInt(s) : null);
        cv.setCvPhone(req.getParameter("phone"));
        cv.setCvBirth(req.getParameter("birth"));
        cv.setCvEmail(req.getParameter("email"));
        cv.setCvWxid(req.getParameter("wxid"));
        cv.setCvHeadImage(req.getParameter("head_image"));
        cv.setCvPersonalSkill(req.getParameter("personal_skill"));
        cv.setCvHopeCareer(req.getParameter("hope_career"));
        cv.setCvWorkExp(req.getParameter("work_exp"));
        cv.setCvProjectExp(req.getParameter("project_exp"));
        cv.setCvStudyExp(req.getParameter("study_exp"));

        ServiceResponse<Void> res = cvService.insertPersonalCV(cv);
        PrintWriter pw = resp.getWriter();

        if(res.isSuccess()) {
            success(pw);
        } else {
            failure(res.code(), pw);
        }
    }
}
