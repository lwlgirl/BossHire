package com.lwl.bosshire.servlet.pub;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lzf abc123lzf@126.com
 * @since 2019/12/16 13:56
 * 职位列表查询
 */
@WebServlet("/api/public/career/list")
@Deprecated
public class CareerListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }
}
