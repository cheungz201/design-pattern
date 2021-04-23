package com.cheungz.singleton;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-03-21 19:53
 * @Version: 0.0.1
 * @Description: 通过静态内部类获取单例对象，因为在调用getInstance时才会实例化内部类，
 *               此时才会创建StaticInnerClass的实例对象
 **/
public class StaticInnerClass {

    private StaticInnerClass(){}

    public static StaticInnerClass getInstance(){
        return Inner.staticInnerClass;
    }


    private static class Inner{
        private static StaticInnerClass staticInnerClass = new StaticInnerClass();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread( () -> {
                System.out.println(StaticInnerClass.getInstance());
            }).start();
        }
    }

}
