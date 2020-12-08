package com.cheungz.adapter;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-12-01 20:16
 * @description:
 **/
public class Test {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.recharge(new AdapterImplement(new TypeC()));
    }
}
