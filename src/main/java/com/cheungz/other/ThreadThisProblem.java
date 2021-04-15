package com.cheungz.other;

/**
 * @program: More
 * @author: Zhang Zhe
 * @create: 2021-03-03 10:22
 * @version: 0.0.1
 * @description:
 **/
public class ThreadThisProblem {

    public volatile int a;

    public void selfAdd(){
        a++;
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadThisProblem threadThisProblem = new ThreadThisProblem();
        for (int i = 0; i < 10; i++) {
            new Thread(){
                @Override
                public void run(){
                    for (int j = 0; j < 1000; j++) {
                        threadThisProblem.selfAdd();
                    }
                }
            }.start();
        }
        Thread.sleep(1000);
        System.out.println(threadThisProblem.a);

    }

}


