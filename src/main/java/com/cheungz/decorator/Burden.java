package com.cheungz.decorator;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-12-06 20:51
 * @description:
 **/
public class Burden {
    private String name;   //配料的名称
    private float price;   //配料的价格

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
}
