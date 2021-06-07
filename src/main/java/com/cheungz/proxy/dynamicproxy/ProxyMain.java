package com.cheungz.proxy.dynamicproxy;


import java.lang.reflect.InvocationTargetException;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-05-08 19:46
 * @Version: 1.0.0
 * @Description:
 **/
public class ProxyMain {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {

        Subject subject = new SubjectImpl();

        InvocationHandlerImpl invocationHandlerImpl = new InvocationHandlerImpl(subject);
        Subject s = (Subject) invocationHandlerImpl.getProxySubject();

        s.sayHello();

        s.sayGoodBye();


    }

}
