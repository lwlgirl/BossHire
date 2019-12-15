package com.lwl.bosshire.common;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 16:25
 */
public interface ServiceResponse<T> {

    int code();

    T data();

    default boolean isSuccess() {
        return code() == 0;
    }

    static <T> ServiceResponse<T> success(T data) {
        return new ServiceResponseImpl<>(0, data);
    }

    static <T> ServiceResponse<T> success() {
        return new ServiceResponseImpl<>(0);
    }

    static <T> ServiceResponse<T> failure(int code) {
        return new ServiceResponseImpl<>(code);
    }
}


class ServiceResponseImpl<T> implements ServiceResponse<T> {
    private final int code;
    private final T data;

    ServiceResponseImpl(int code, T data) {
        this.code = code;
        this.data = data;
    }

    ServiceResponseImpl(int code) {
        this.code = code;
        this.data = null;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public T data() {
        return data;
    }
}