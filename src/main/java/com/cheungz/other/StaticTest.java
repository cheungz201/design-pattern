package com.cheungz.other;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-04-23 13:56
 * @Version: 1.0.0
 * @Description:
 **/
public class StaticTest {

    static{
        System.out.println("静态代码块");
    }

    public static void staticFun(){
        System.out.println("这是一个静态方法");
    }

    public void fun(){
        System.out.println("这是一个动态方法");
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class a = Class.forName("com.cheungz.other.StaticTest");
        StaticTest v = (StaticTest)a.newInstance();
        v.fun();
    }
}
