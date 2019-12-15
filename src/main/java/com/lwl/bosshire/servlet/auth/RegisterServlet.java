package com.lwl.bosshire.servlet.auth;

import com.lwl.bosshire.common.Role;
import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.dao.UserMapper;
import com.lwl.bosshire.pojo.User;
import com.lwl.bosshire.service.user.UserBasicService;
import lombok.extern.log4j.Log4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.lwl.bosshire.config.DataSourceUtils.*;
import static com.lwl.bosshire.common.ResponseMessage.buildString;

@Log4j
@WebServlet("/api/user/register")
public class RegisterServlet extends HttpServlet {

    private final UserBasicService userBasicService = UserBasicService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String user = req.getParameter("phone");
        String pass = req.getParameter("password");
        String role = req.getParameter("role");
        String nick = req.getParameter("nick");

        if(user == null || pass == null || role == null || nick == null) {
            resp.sendError(400);
            return;
        }

        User u = new User();
        u.setPhone(user);
        u.setPassword(pass);
        u.setRole(Integer.parseInt(role));
        u.setNickname(nick);
        u.setStatus(0);

        ServiceResponse<Void> res = userBasicService.register(user, pass, nick, Role.valueOf(Integer.parseInt(role)));
        PrintWriter pw = resp.getWriter();

        if(res.isSuccess()) {
            pw.write(buildString(0, "SUCCESS"));
        } else {
            pw.write(buildString(1, "Error occur"));
        }
    }
}
