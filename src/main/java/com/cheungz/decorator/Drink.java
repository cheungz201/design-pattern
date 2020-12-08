package com.cheungz.decorator;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-12-06 20:18
 * @description: 饮料抽象类
 **/
public abstract class Drink {

    private String name;      //饮料名称
    private  float price;     //饮料价格

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();    //饮料的价格
}
