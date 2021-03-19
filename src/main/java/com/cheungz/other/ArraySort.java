package com.cheungz.other;

/**
 * @program: More
 * @author: Zhang Zhe
 * @create: 2021-02-06 21:31
 * @version: 0.0.1
 * @description:
 **/
public class ArraySort implements Runnable{

    private int num;

    public ArraySort(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{100,56,54,89,321,699,156,821,23,8000};
        for (int number : numbers){
            new Thread(new ArraySort(number)).start();
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(num);
            System.out.println(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
