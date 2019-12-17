package com.lwl.bosshire.servlet.person;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.service.job.JobService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.lwl.bosshire.utils.ResponseUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.17 8:56
 */
@WebServlet("/api/personal/jobapply/send")
public class SendJobApplyServlet extends HttpServlet {

    private final JobService jobService = JobService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int careerId = Integer.parseInt(req.getParameter("career_id"));
        int cvid = Integer.parseInt(req.getParameter("cvid"));

        PrintWriter pw = resp.getWriter();
        ServiceResponse<Void> res = jobService.sendJobApply(careerId, cvid);
        if(res.isSuccess()) {
            success(pw);
        } else {
            failure(res.code(), pw);
        }
    }
}
