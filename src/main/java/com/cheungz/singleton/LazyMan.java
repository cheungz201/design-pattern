package com.cheungz.singleton;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-03-21 18:46
 * @Version: 0.0.1
 * @Description: 懒汉式单例模式
 **/
public class LazyMan {

    //线程不安全，多线程访问时都可以访问到

    private LazyMan(){
        System.out.println(Thread.currentThread().getName()+"成功访问"+lazyMan);
    }

    private static LazyMan lazyMan;

    public static LazyMan getInstance(){

        if (lazyMan == null){
            lazyMan = new LazyMan();
        }

        return lazyMan;
    }

    public static void main(String[] args) {


        /*System.out.println(LazyMan.getInstance());
        System.out.println(LazyMan.getInstance());
        System.out.println(LazyMan.getInstance());
        System.out.println(LazyMan.getInstance());
        System.out.println(LazyMan.getInstance());
        System.out.println(LazyMan.getInstance());
        System.out.println(LazyMan.getInstance());
        System.out.println(LazyMan.getInstance());
        System.out.println(LazyMan.getInstance());
        System.out.println(LazyMan.getInstance());
        System.out.println(LazyMan.getInstance());
        System.out.println(LazyMan.getInstance());*/
        for (int i = 0; i < 10; i++) {

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+LazyMan.getInstance());
                }
            };

            new Thread(runnable).start();
        }
    }


}
