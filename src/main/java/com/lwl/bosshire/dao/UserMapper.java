package com.lwl.bosshire.dao;

import com.lwl.bosshire.pojo.User;

import java.util.List;

public interface UserMapper {

    int delete(int userId);

    int insert(User user);

    int update(User user);

    User selectUser(int id);

    User selectUser(String username);

    List<User> selectAll();
}
