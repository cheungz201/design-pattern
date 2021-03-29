package com.cheungz.singleton;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-03-21 19:10
 * @Version: 0.0.1
 * @Description: 加锁的单例模式
 **/
public class DclLazyMan {

    private DclLazyMan(){
        System.out.println(Thread.currentThread().getName()+"访问成功");
    }

    private static DclLazyMan lazyMan;


    //单重锁定，仍然有线程安全问题
    private static DclLazyMan getInstance(){
        if (lazyMan == null){
            synchronized (DclLazyMan.class){
                lazyMan = new DclLazyMan();
            }
        }
        return lazyMan;
    }


    //双重锁定，线程安全，但是会被反射破坏
    /*private static DclLazyMan getInstance(){
        if (lazyMan == null){
            synchronized (DclLazyMan.class){
                if (lazyMan == null){
                    lazyMan = new DclLazyMan();
                }
            }
        }
        return lazyMan;
    }*/


    public static void main(String[] args) {

//        System.out.println(getInstance());

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                 DclLazyMan dclLazyMan = getInstance();
                System.out.println(Thread.currentThread().getName()+dclLazyMan);
            }).start();
        }
    }
}
