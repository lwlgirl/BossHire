package com.lwl.bosshire.vo;

import com.lwl.bosshire.pojo.User;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lzf abc123lzf@126.com
 * @since 2019/12/16 10:56
 */
@Data
@NoArgsConstructor
public class UserVo {
    private Integer userId;

    private String phone;

    private String email;

    private String nickname;

    private Integer role;

    private Integer status;

    public UserVo(User user) {
        this.userId = user.getUserId();
        this.phone = user.getPhone();
        this.email = user.getEmail();
        this.nickname = user.getNickname();
        this.role = user.getRole();
        this.status = user.getStatus();
    }
}
