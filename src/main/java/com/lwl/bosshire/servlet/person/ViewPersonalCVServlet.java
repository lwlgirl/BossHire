package com.lwl.bosshire.servlet.person;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.pojo.CV;
import com.lwl.bosshire.service.cv.CVService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static com.lwl.bosshire.utils.ResponseUtils.*;

/**
 * @author lzf abc123lzf@126.com
 * @since 2019/12/16 13:06
 * 浏览本人简历细节
 */
@WebServlet("/api/personal/cv/view")
public class ViewPersonalCVServlet extends HttpServlet {

    private final CVService cvService = CVService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        ServiceResponse<List<CV>> res = cvService.personalCVList();
        PrintWriter pw = resp.getWriter();
        if(res.isSuccess()) {
            success(res.data(), pw);
        } else {
            failure(res.code(), pw);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        this.doGet(req, resp);
    }
}
