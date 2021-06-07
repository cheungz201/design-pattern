package com.cheungz.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-05-08 19:39
 * @Version: 1.0.0
 * @Description:
 **/
public class InvocationHandlerImpl implements InvocationHandler {

    private Object subject;

    public InvocationHandlerImpl(Object subject) {
        this.subject = subject;
    }

    public Object getProxySubject() {
        return Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 调用真正方法之前
        System.out.println("before...");

        Object o = method.invoke(subject, args);

        // 调用真正方法之后
        System.out.println("after...");

        return o;
    }
}
