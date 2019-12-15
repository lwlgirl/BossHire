package com.lwl.bosshire.utils;

import com.lwl.bosshire.common.Role;
import com.lwl.bosshire.pojo.User;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.14 21:57
 */
public final class UserContext {

    public static final String USER_KEY = "user";
    private static final ThreadLocal<User> context = new ThreadLocal<>();

    public static User get() {
        return context.get();
    }

    public static Role userRole() {
        User user = get();
        return user != null ? Role.valueOf(user.getRole()) : null;
    }

    public static void set(User user) {
        context.set(user);
    }


    private UserContext() {
        throw new UnsupportedOperationException();
    }

}
