package com.lwl.bosshire.servlet.company;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.service.cv.CVService;
import com.lwl.bosshire.vo.DeliverCV;

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
 * @since 2019/12/16 13:24
 * 查看公司收到的求职信息
 */
@WebServlet("/api/company/cv/view")
public class ViewCompanyCVServlet extends HttpServlet {

    private final CVService cvService = CVService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        ServiceResponse<List<DeliverCV>> res = cvService.companyCVList();
        PrintWriter pw = resp.getWriter();
        if(res.isSuccess()) {
            success(res.data(), pw);
        } else {
            failure(res.code(), pw);
        }
    }
}
