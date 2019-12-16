package com.lwl.bosshire.servlet.pub;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.pojo.JobApply;
import com.lwl.bosshire.service.job.JobService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static com.lwl.bosshire.utils.ResponseUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 15:51
 * 个人求职信息/公司收到的求职
 */
@WebServlet({"/api/company/job/query", "/api/personal/job/query"})
public class JobApplyQueryServlet extends HttpServlet {

    private final JobService jobService = JobService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServiceResponse<List<JobApply>> res = jobService.queryJobApplyInfo();
        PrintWriter pw = resp.getWriter();
        if(res.isSuccess()) {
            success(pw);
        } else {
            failure(res.code(), pw);
        }
    }
}
