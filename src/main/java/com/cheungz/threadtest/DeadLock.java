package com.cheungz.threadtest;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-08-10 14:27
 * @Version: 1.0.0
 * @Description:
 **/
public class DeadLock {

    public static void main(String[] args) throws InterruptedException {

        Phone phone = new Phone();
        Phone phone1 = new Phone();


        new Thread(() -> {
            System.out.println("Thread A running!");
            synchronized (phone){
                System.out.println("Thread A get phone resource");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread A ready get phone1...");
                synchronized (phone1){
                    System.out.println("Thread A get phone1 resource");
                }
            }
        }, "A").start();

        Thread.sleep(100);

        new Thread(() -> {
            System.out.println("Thread B running!");
            synchronized (phone1){
                System.out.println("Thread B get phone1 resource");
                System.out.println("Thread B ready get phone...");
                synchronized (phone){
                    System.out.println("Thread B get phone resource");
                }
            }
        }, "B").start();

    }
}

class Phone{
    public synchronized void msg() {
        System.out.println(Thread.currentThread().getName()+":"+"发短信");
    }

    public synchronized void call(){
        System.out.println(Thread.currentThread().getName()+":"+"打电话");
    }

    public synchronized void hello(){
        System.out.println("Hello");
    }

}
