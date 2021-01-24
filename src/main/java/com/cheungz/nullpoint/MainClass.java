package com.cheungz.nullpoint;

/**
 * @program: design-pattern
 * @author: cheungZ
 * @create: 2021-01-25 00:21
 * @description:
 **/
public class MainClass implements NullPoint{
    @Override
    public void fun() {
        System.out.println("do some");
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
