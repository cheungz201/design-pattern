package com.cheungz.other;

import java.util.ArrayList;

/**
 * @program: More
 * @description:测试test
 * @author: z'z
 * @create: 2020-09-05 17:23
 **/
public class Hello {
    
    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.f(5));
    }

    public int foo(int n){
        if (n < 2)  return n;
        return foo(n - 1) + foo(n - 2);
    }


    public int f(int n){
        if (n < 2)  return n;
        return f(n - 1);
    }

    private final int MAX = 5;
    private final ArrayList<Integer> list = new ArrayList<>();
    synchronized void put(int v) throws InterruptedException {
        if (list.size() == MAX) {
            wait();
        }
        list.add(v);
        notifyAll();
    }

    synchronized int get() throws InterruptedException {
        // line 0
        if (list.size() == 0) {  // line 1
            wait();  // line2
            // line 3
        }
        int v = list.remove(0);  // line 4
        notifyAll(); // line 5
        return v;
    }

    synchronized int size() {
        return list.size();
    }
}

