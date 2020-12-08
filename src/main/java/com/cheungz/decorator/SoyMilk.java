package com.cheungz.decorator;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-12-06 20:21
 * @description: 豆浆实体类
 **/
public class SoyMilk extends Drink {

    //返回豆浆的价格
    @Override
    public float cost() {
        return super.getPrice();
    }
}
