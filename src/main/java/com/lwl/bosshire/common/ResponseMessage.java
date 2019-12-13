package com.lwl.bosshire.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONAware;
import com.alibaba.fastjson.annotation.JSONField;

public final class ResponseMessage {

    private final int code;

    private final String msg;

    private final Object data;

    private ResponseMessage(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private ResponseMessage(int code, String msg) {
        this(code, msg, null);
    }

    public static ResponseMessage build(int code, String msg) {
        return new ResponseMessage(code, msg);
    }

    public static ResponseMessage build(int code, String msg, Object data) {
        return new ResponseMessage(code, msg, data);
    }

    public static String buildString(int code, String msg) {
        return new ResponseMessage(code, msg).toJSONString();
    }

    public static String buildString(int code, String msg, Object data) {
        return new ResponseMessage(code, msg, data).toJSONString();
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @SuppressWarnings("unchecked")
    public <T> T getData() {
        return (T)data;
    }


    public String toJSONString() {
        return JSON.toJSONString(this);
    }

    @Override
    public String toString() {
        return toJSONString();
    }
}
