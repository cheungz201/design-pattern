package com.cheungz.decorator;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-12-06 20:58
 * @description: 装饰者模式domain
 **/
public class domain {
    public static void main(String[] args) {
        /**
         * @Author:  cheungZ
         * @Time:  2020/12/6 21:03
         * @description: 购买黑芝麻豆浆并通过装饰器加入蜂蜜配料
         **/
        BlackSesameSoyMilk blackSesameSoyMilk = new BlackSesameSoyMilk();
        Honey honey = new Honey();
        Decorator decorator = new Decorator(blackSesameSoyMilk,honey);
        System.out.println("购买"+blackSesameSoyMilk.getName()+"配料"+honey.getName()+"一共"+decorator.cost());
    }
}
