package com.lwl.bosshire.service.user;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.dao.UserMapper;
import com.lwl.bosshire.pojo.User;
import com.lwl.bosshire.utils.UserContext;
import lombok.extern.log4j.Log4j;

import static com.lwl.bosshire.common.ServiceResponse.*;
import static com.lwl.bosshire.config.DataSourceUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 19:58
 */
@Log4j
class UserManageServiceImpl implements UserManageService {

    public ServiceResponse<Void> changePassword(String oldPass, String newPass) {
        User user = UserContext.get();
        if(user == null) {
            return failure(-1);
        }

        if(!user.getPassword().equals(oldPass)) {
            return failure(1);
        }

        user.setPassword(newPass);
        UserMapper mapper = getMapper(UserMapper.class);

        try {
            mapper.updateByPrimaryKeySelective(user);
            commit();
            return success();
        } catch (RuntimeException e) {
            log.error(e);
            user.setPassword(oldPass);
            rollback();
            return failure(-2);
        }
    }


    @Override
    public ServiceResponse<Void> changeEmail(String email) {
        User user = UserContext.get();
        if(user == null) {
            return failure(-1);
        }

        String old = user.getEmail();
        UserMapper mapper = getMapper(UserMapper.class);
        user.setEmail(email);
        try {
            mapper.updateByPrimaryKey(user);
            commit();
            return success();
        } catch (RuntimeException e) {
            log.error(e);
            user.setEmail(old);
            rollback();
            return failure(-2);
        }
    }

    @Override
    public ServiceResponse<Void> changeNickName(String nickName) {
        User user = UserContext.get();
        if(user == null) {
            return failure(-1);
        }

        String old = user.getNickname();
        UserMapper mapper = getMapper(UserMapper.class);
        user.setNickname(nickName);
        try {
            mapper.updateByPrimaryKey(user);
            commit();
            return success();
        } catch (RuntimeException e) {
            log.error(e);
            user.setNickname(old);
            rollback();
            return failure(-2);
        }
    }
}
