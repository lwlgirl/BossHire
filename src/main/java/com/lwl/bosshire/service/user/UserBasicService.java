package com.lwl.bosshire.service.user;

import com.lwl.bosshire.common.Role;
import com.lwl.bosshire.common.ServiceResponse;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 19:39
 */
public interface UserBasicService {

    UserBasicService INSTANCE = new UserBasicServiceImpl();

    ServiceResponse<Void> login(String phone, String password);

    ServiceResponse<Void> register(String phone, String password, String nickname, Role role);
}
