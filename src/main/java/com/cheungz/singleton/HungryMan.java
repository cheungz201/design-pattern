package com.cheungz.singleton;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-03-21 18:39
 * @Version: 0.0.1
 * @Description: 饿汉式单例模式
 **/
public class HungryMan {

    //如果一直没有使用则会浪费内存空间

    private HungryMan(){}

    private static HungryMan hungryMan = new HungryMan();

    public static HungryMan getHungryMan(){
        return hungryMan;
    }
}
