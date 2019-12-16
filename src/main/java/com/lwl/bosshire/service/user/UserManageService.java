package com.lwl.bosshire.service.user;

import com.lwl.bosshire.common.ServiceResponse;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 19:57
 */
public interface UserManageService {

    UserManageService INSTANCE = new UserManageServiceImpl();

    ServiceResponse<Void> changePassword(String oldPass, String newPass);

    ServiceResponse<Void> changeEmail(String email);

    ServiceResponse<Void> changeNickName(String nickName);

}
