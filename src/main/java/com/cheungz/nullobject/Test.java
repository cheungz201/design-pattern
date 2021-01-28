package com.cheungz.nullobject;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2021-01-25 14:46
 * @description:
 **/
public class Test {
    public static void main(String[] args) {

        ModelObject modelObject = new ModelObject();
        ObjectFactory.get(modelObject).doSomething();

        

    }
}
