package com.cheungz.singleton;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-03-21 19:10
 * @Version: 0.0.1
 * @Description: 加锁的单例模式
 **/
public class DclLazyMan {

    private volatile static DclLazyMan lazyMan;

    private DclLazyMan() {}

    //双重锁定，线程安全，但是会被反射破坏
    private static DclLazyMan getInstance(){
        if (lazyMan == null){
            synchronized (DclLazyMan.class){
                if (lazyMan == null){
                    lazyMan = new DclLazyMan();
                }
            }
        }
        return lazyMan;
    }

    void fun(){
        System.out.println("this is a meaningless method");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                DclLazyMan.getInstance().fun();
            }).start();
        }
    }
}
