package com.lwl.bosshire.common;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.14 22:10
 */
public enum Role {

    JH, HR;

    public int val() {
        return ordinal();
    }

    public static Role valueOf(int val) {
        if(val == 0) {
            return JH;
        } else if(val == 1) {
            return HR;
        }

        return null;
    }

}
