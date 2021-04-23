package com.cheungz.singleton;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-04-23 13:36
 * @Version: 1.0.0
 * @Description:
 **/
public enum EnumOnly {
    Model;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread( () ->{
                System.out.println(EnumOnly.Model);
            }).start();
        }
    }
}
