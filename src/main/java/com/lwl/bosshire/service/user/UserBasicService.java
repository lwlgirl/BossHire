package com.lwl.bosshire.service.user;

import com.lwl.bosshire.common.Role;
import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.pojo.User;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 19:39
 */
public interface UserBasicService {

    UserBasicService INSTANCE = new UserBasicServiceImpl();

    ServiceResponse<User> login(String phone, String password);

    ServiceResponse<Void> register(String phone, String password, String nickname, Role role);
}
