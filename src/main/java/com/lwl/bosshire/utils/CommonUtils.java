package com.lwl.bosshire.utils;

import java.util.List;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.14 20:01
 */
public final class CommonUtils {

    public static <T> T getFirst(List<T> list) {
        return list == null || list.size() == 0 ? null : list.get(0);
    }



    private CommonUtils() { }

}
