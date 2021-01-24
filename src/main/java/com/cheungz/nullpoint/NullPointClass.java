package com.cheungz.nullpoint;

/**
 * @program: design-pattern
 * @author: cheungZ
 * @create: 2021-01-25 00:22
 * @description:
 **/
public class NullPointClass implements NullPoint {

    @Override
    public void fun() {
        System.out.println("air");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
