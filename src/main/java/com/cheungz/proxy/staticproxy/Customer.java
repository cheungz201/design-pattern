package com.cheungz.proxy.staticproxy;

/**
 * @program: More
 * @author: zhangZhe
 * @create: 2021-01-28 19:14
 * @description:
 **/
public class Customer implements BuyHouse{
    @Override
    public void buyHouse() {
        System.out.println("我是顾客要买房");
    }
}
