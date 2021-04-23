package com.cheungz.other;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-04-20 22:57
 * @Version: 0.0.1
 * @Description:
 **/
public class ConditionTest {

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    private static int MAX;

    public static void main(String[] args) {

        ConditionTest test = new ConditionTest();
        Producer producer = test.new Producer();
        Consumer consumer = test.new Consumer();

        consumer.start();
        producer.start();
    }

    class Consumer extends Thread {

        @Override
        public void run() {
            consume();
        }

        private void consume() {

            try {
                lock.lock();
                System.out.println(this.currentThread().getName() + "等待信号");
                condition.await();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(this.currentThread().getName() + "获取信号");
                lock.unlock();
            }

        }
    }

    class Producer extends Thread {

        @Override
        public void run() {
            produce();
        }

        private void produce() {
            try {
                lock.lock();
                System.out.println(this.currentThread().getName() + "我拿到锁");
                condition.signalAll();
                System.out.println(this.currentThread().getName() + "发出信号");
            } finally {
                lock.unlock();
            }
        }
    }
}
