package com.lwl.bosshire.pojo;

import lombok.Data;

@Data
public class User {
    private Integer userId;

    private String phone;

    private String email;

    private String password;

    private String nickname;

    private Integer role;

    private Integer status;

}