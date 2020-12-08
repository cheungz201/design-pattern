package com.cheungz.factory;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-11-12 12:31
 * @description:
 **/
public class MainTest {
    public static void main(String[] args) {
        Commodity commodity = new HuaWeiFactory().getCommodity();
        commodity.work();
    }
}
