package com.lwl.bosshire.servlet.auth;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.service.user.UserManageService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.lwl.bosshire.utils.ResponseUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 19:54
 */
@WebServlet("/api/user/info/update")
public class UpdateUserInfoServlet extends HttpServlet {

    private final UserManageService userManageService = UserManageService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter pw = resp.getWriter();

        String oldPass = req.getParameter("oldPass");
        String newPass = req.getParameter("newPass");
        if(oldPass != null && newPass != null) {
            ServiceResponse<Void> res = userManageService.changePassword(oldPass, newPass);
            if(res.isSuccess()) {
                success(pw);
            } else {
                failure(res.code(), "Change Password failure", pw);
            }
            return;
        }


        String nickName = req.getParameter("nickname");
        if(nickName != null) {
            ServiceResponse<Void> res = userManageService.changeNickName(nickName);
            if(res.isSuccess()) {
                success(pw);
            } else {
                failure(res.code(), "Change nickname failure", pw);
            }
            return;
        }

        String email = req.getParameter("email");
        if(email != null) {
            ServiceResponse<Void> res = userManageService.changeEmail(email);
            if(res.isSuccess()) {
                success(pw);
            } else {
                failure(res.code(), "Change email failure", pw);
            }
        }
    }
}
