package com.cheungz.threadtest;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-11-19 11:57
 * @description:
 **/
public class DoMain {

    public synchronized void fun(String str){

        System.out.println(str);
    }
    public void otherFun(String str) throws InterruptedException {
        System.out.println("这是其他方法，暂停3s");
        Thread.sleep(3000);
        synchronized (this){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        DoMain doMain = new DoMain();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                doMain.fun("fun");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    doMain.otherFun("fun2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
        t1.start();
    }

}
