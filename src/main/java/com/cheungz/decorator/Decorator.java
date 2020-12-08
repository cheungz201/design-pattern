package com.cheungz.decorator;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-12-06 20:39
 * @description: 豆浆装饰器的实体类
 **/
public class Decorator {

    private Drink drink;
    private Burden burden;

    public Decorator(Drink drink, Burden burden) {
        this.drink = drink;
        this.burden = burden;
    }

    public float cost() {
        return drink.getPrice()+burden.getPrice();
    }
}
