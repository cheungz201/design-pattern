package com.cheungz.proxy.staticproxy;

/**
 * @program: More
 * @author: zhangZhe
 * @create: 2021-01-28 19:15
 * @description:
 **/
public class Intermediary implements BuyHouse {

    private BuyHouse buyHouse;

    public Intermediary(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        buyHouse.buyHouse();
        System.out.println("寻找房源");
    }
}
