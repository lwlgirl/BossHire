package com.lwl.bosshire.servlet.auth;

import com.lwl.bosshire.pojo.User;
import com.lwl.bosshire.utils.UserContext;
import com.lwl.bosshire.vo.UserVo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.lwl.bosshire.utils.ResponseUtils.*;

/**
 * @author lzf abc123lzf@126.com
 * @since 2019/12/16 10:44
 */
@WebServlet("/api/user/context")
public class ContextUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = UserContext.get();
        PrintWriter pw = resp.getWriter();
        if(user != null) {
            success(new UserVo(user), pw);
        } else {
            failure(1, "Not login", pw);
        }
    }
}
