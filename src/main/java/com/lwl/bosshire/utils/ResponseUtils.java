package com.lwl.bosshire.utils;

import com.alibaba.fastjson.JSON;
import com.lwl.bosshire.common.ResponseMessage;

import java.io.IOException;
import java.io.Writer;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 11:17
 */
public final class ResponseUtils {

    private static final String SUCCESS_MSG;

    static {
        ResponseMessage msg = ResponseMessage.build(0, "SUCCESS");
        SUCCESS_MSG = JSON.toJSONString(msg);
    }

    public static String success() {
        return SUCCESS_MSG;
    }

    public static String success(Object object) {
        return ResponseMessage.buildString(0, "SUCCESS", object);
    }

    public static String failure(int code) {
        return ResponseMessage.buildString(code, "FAILURE");
    }

    public static void success(Writer writer) throws IOException {
        writer.write(SUCCESS_MSG);
    }

    public static void success(Object data, Writer writer) throws IOException {
        writer.write(ResponseMessage.buildString(0, "SUCCESS", data));
    }

    public static void failure(int code, Writer writer) throws IOException {
        writer.write(ResponseMessage.buildString(code, "FAILURE"));
    }

    public static void failure(int code, String message, Writer writer) throws IOException {
        writer.write(ResponseMessage.buildString(code, message));
    }
}
