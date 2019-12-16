package com.lwl.bosshire.servlet.auth;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.pojo.User;
import com.lwl.bosshire.service.user.UserBasicService;
import com.lwl.bosshire.utils.UserContext;
import lombok.extern.log4j.Log4j;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.lwl.bosshire.common.ResponseMessage.*;

@Log4j
@WebServlet("/api/user/login")
public class LoginServlet extends HttpServlet {

    private final UserBasicService userBasicService = UserBasicService.INSTANCE;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");

        ServiceResponse<User> res = userBasicService.login(phone, password);
        PrintWriter pw = response.getWriter();
        if(res.isSuccess()) {
            request.getSession().setAttribute(UserContext.USER_KEY, res.data());
            pw.write(buildString(0, "SUCCESS"));
            return;
        }

        pw.write(buildString(res.code(), "FAILURE"));
    }
}
