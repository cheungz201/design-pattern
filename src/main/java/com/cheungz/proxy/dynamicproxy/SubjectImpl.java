package com.cheungz.proxy.dynamicproxy;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-05-08 19:37
 * @Version: 1.0.0
 * @Description:
 **/
public class SubjectImpl implements Subject{
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }

    @Override
    public void sayGoodBye() {
        System.out.println("Good Bye!");
    }
}
