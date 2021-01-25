package com.cheungz.nullobject;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2021-01-25 14:39
 * @description:
 **/
public class ModelObject implements NullObject{
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public void doSomething() {
        System.out.println("完成任务");

    }
}
