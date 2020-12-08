package com.cheungz.factory;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-11-12 12:29
 * @description:
 **/
public class Factory {
    public static Commodity getCommodity(String str){
        if (str.equals("iphone"))
            return new Iphone();
        else if (str.equals("huawei"))
                return new HuaWei();
        else return null;
    }
}
