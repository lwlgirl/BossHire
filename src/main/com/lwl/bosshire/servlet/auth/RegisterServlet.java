package com.lwl.bosshire.servlet.auth;

import com.lwl.bosshire.dao.UserMapper;
import com.lwl.bosshire.pojo.User;
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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        if(user == null || pass == null) {
            resp.sendError(400);
            return;
        }

        User u = new User();
        u.setUserName(user);
        u.setUserPassword(pass);

        PrintWriter pw = resp.getWriter();
        try {
            UserMapper mapper = getMapper(UserMapper.class);
            mapper.insert(u);
            commit();
            pw.write(buildString(0, "SUCCESS"));
        } catch (RuntimeException e) {
            rollback();
            log.error(e);
            pw.write(buildString(1, "Error occur"));
        } finally {
            close();
        }
    }
}
