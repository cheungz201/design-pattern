package com.cheungz.ohter;

/**
 * @program: More
 * @author: Zhang Zhe
 * @create: 2021-03-03 10:22
 * @version: 0.0.1
 * @description:
 **/
public class ThreadThisProblem extends Thread{
    
    @Override
    public void run() {
        System.out.println(this.getName());
        System.out.println(Thread.currentThread().getName());
    }
    static class Hello{
        public static void main(String[] args) throws InterruptedException {
            Thread thread = new ThreadThisProblem();
            Thread thread1 = new Thread(thread);
            thread.start();
            thread1.start();
        }
        

    }

}


