package com.cheungz.ohter;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-11-03 21:12
 * @description:
 **/
public class Multithreading {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                this.setName("线程1");
                for (int i = 0; i <= 19; i++) {
                    System.out.println(this.getName() + ": " +i);
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                this.setName("线程2");
                System.out.println(this.isInterrupted());
                this.interrupt();
                System.out.println(this.isInterrupted());
                /*for (int i = 0; i <= 19; i++) {
                    System.out.println(this.getName() + ": " + i);
                }*/
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(this.isInterrupted());
                    e.printStackTrace();
                    throw new RuntimeException("catch中手动抛异常结束线程2");
                }
                System.out.println(Thread.currentThread().getState());
                System.out.println(activeCount());
            }
        };
        t2.start();
    }
}
