package com.lwl.bosshire.config;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public final class DataSourceUtils {
    private static final DataSourceUtils instance;
    private final SqlSessionFactory sqlSessionFactory;
    private final ThreadLocal<SqlSession> sessionThreadLocal = new ThreadLocal<>();
    static {
        instance = new DataSourceUtils();
    }

    private DataSourceUtils() {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
        this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    private static void openSession() {
        if(instance.sessionThreadLocal.get() != null) {
            throw new IllegalStateException("Session has open!");
        }

        instance.sessionThreadLocal.set(instance.sqlSessionFactory.openSession());
    }

    public static <T> T getMapper(Class<T> c) {
        SqlSession session = instance.sessionThreadLocal.get();
        if(session == null) {
            openSession();
            session = instance.sessionThreadLocal.get();
        }
        return session.getMapper(c);
    }

    public static void commit(){
        SqlSession session = instance.sessionThreadLocal.get();
        if(session == null) {
            throw new IllegalStateException("Session is not open!");
        }
        session.commit();

    }

    public static void rollback() {
        SqlSession session = instance.sessionThreadLocal.get();
        if(session == null) {
            throw new IllegalStateException("Session is not open!");
        }
        session.rollback();
    }

    public static void close() {
        SqlSession session = instance.sessionThreadLocal.get();
        if(session == null) {
            throw new IllegalStateException("Session is not open!");
        }
        session.close();
        instance.sessionThreadLocal.set(null);
    }

    public static boolean isOpen() {
        return instance.sessionThreadLocal.get() != null;
    }
}
