package com.lwl.bosshire.servlet.company;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.service.job.JobService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static com.lwl.bosshire.utils.ResponseUtils.*;

/**
 * @author lzf abc123lzf@126.com
 * @since 2019/12/16 14:02
 * 处理求职者简历
 */
@WebServlet("/api/company/job/process")
public class ProcessCVServlet extends HttpServlet {

    private final JobService jobService = JobService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String[] cvids = req.getParameterValues("cvid");
        List<Integer> list = new ArrayList<>(cvids.length);

        for (String cvid : cvids) {
            list.add(Integer.parseInt(cvid));
        }

        int status = Integer.parseInt(req.getParameter("status"));
        ServiceResponse<Void> res = jobService.changeStatus(list, status);
        PrintWriter pw = resp.getWriter();

        if(res.isSuccess()) {
            success(pw);
        } else {
            failure(res.code(), pw);
        }
    }
}
