package com.cheungz.nullobject;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2021-01-25 14:41
 * @description:
 **/
public class FakeObject implements NullObject{
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public void doSomething() {
        System.out.println("这是一个空的对象，无法完成真正的任务");
    }
}
