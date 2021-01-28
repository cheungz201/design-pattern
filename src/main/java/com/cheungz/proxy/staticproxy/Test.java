package com.cheungz.proxy.staticproxy;

/**
 * @program: More
 * @author: zhangZhe
 * @create: 2021-01-28 19:19
 * @description:
 **/
public class Test {
    public static void main(String[] args) {

        Intermediary intermediary = new Intermediary(new Customer());
        intermediary.buyHouse();

    }
}
