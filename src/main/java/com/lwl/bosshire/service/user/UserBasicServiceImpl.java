package com.lwl.bosshire.service.user;

import com.lwl.bosshire.common.Role;
import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.config.DataSourceUtils;
import com.lwl.bosshire.dao.UserMapper;
import com.lwl.bosshire.pojo.User;
import com.lwl.bosshire.pojo.UserExample;
import lombok.extern.log4j.Log4j;

import static com.lwl.bosshire.common.ServiceResponse.*;
import static com.lwl.bosshire.config.DataSourceUtils.*;
import static com.lwl.bosshire.utils.CommonUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 19:39
 */
@Log4j
class UserBasicServiceImpl implements UserBasicService {

    @Override
    public ServiceResponse<Void> login(String phone, String password) {

        UserMapper userMapper = DataSourceUtils.getMapper(UserMapper.class);
        UserExample ue = new UserExample();
        ue.createCriteria().andPhoneEqualTo(phone);

        try {
            User user = getFirst(userMapper.selectByExample(ue));
            if(user == null) {
                return failure(1);
            } else {
                if(user.getPassword().equals(password)) {
                    return success();
                } else {
                    return failure(2);
                }
            }
        } catch (RuntimeException e) {
            log.error(e);
            return failure(-1);
        }
    }

    @Override
    public ServiceResponse<Void> register(String phone, String password,
                                          String nickname, Role role) {
        User u = new User();
        u.setPhone(phone);
        u.setPassword(password);
        u.setRole(role.val());
        u.setNickname(nickname);
        u.setStatus(0);

        try {
            UserMapper mapper = getMapper(UserMapper.class);
            mapper.insert(u);
            commit();
            return success();
        } catch (RuntimeException e) {
            log.error(e);
            rollback();
            return failure(1);
        }
    }
}
