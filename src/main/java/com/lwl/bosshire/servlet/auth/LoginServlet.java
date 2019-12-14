package com.lwl.bosshire.servlet.auth;

import com.lwl.bosshire.common.ResponseMessage;
import com.lwl.bosshire.config.DataSourceUtils;
import com.lwl.bosshire.dao.UserMapper;
import com.lwl.bosshire.pojo.User;
import com.lwl.bosshire.pojo.UserExample;
import com.lwl.bosshire.utils.CommonUtils;
import lombok.extern.log4j.Log4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Log4j
@WebServlet("/api/user/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");

        UserMapper userMapper = DataSourceUtils.getMapper(UserMapper.class);
        try {
            UserExample ue = new UserExample();
            ue.createCriteria().andPhoneEqualTo(phone);
            User user = CommonUtils.getFirst(userMapper.selectByExample(ue));
            PrintWriter pw = response.getWriter();
            if(user == null) {
                pw.write(ResponseMessage.buildString(1, "User not found"));
            } else {
                if(user.getPassword().equals(password)) {
                    request.getSession().setAttribute("user", user);
                    pw.write(ResponseMessage.buildString(0, "Success"));
                } else {
                    pw.write(ResponseMessage.buildString(2, "Password not right"));
                }
            }

            DataSourceUtils.commit();
        } finally {
            DataSourceUtils.close();
        }
    }
}
