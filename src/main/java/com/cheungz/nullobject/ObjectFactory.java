package com.cheungz.nullobject;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2021-01-25 14:42
 * @description:
 **/
public class ObjectFactory {
    public static NullObject get(NullObject nullObject){
        if (nullObject == null)
            return new FakeObject();
        return nullObject;
    }
}
