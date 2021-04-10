package com.cheungz.other;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-04-09 18:07
 * @Version: 0.0.1
 * @Description:
 **/
public class MyLockTest implements Serializable, Lock {


    final Syn syn = new Syn();

    @Override
    public void lock() {
        syn.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return syn.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        syn.release(1);
    }

    @Override
    public Condition newCondition() {
        return null;
    }


    static class Syn extends AbstractQueuedSynchronizer{
        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        @Override
        protected boolean tryAcquire(int arg) {
            if (compareAndSetState(0,1)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        @Override
        protected boolean tryRelease(int arg) {
            if (getState() == 0)
                throw new IllegalMonitorStateException();
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }
    }

static class Test{
        static Lock lock = new MyLockTest();
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    fun();
                }
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    fun();
                }
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
    }

    static void fun(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+"获得锁");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName()+"释放锁");
            lock.unlock();
        }
    }

    /*static void fun(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"获得锁");
        lock.unlock();
        System.out.println(Thread.currentThread().getName()+"释放锁");
    }*/
}
}
