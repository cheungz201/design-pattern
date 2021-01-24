package com.cheungz.nullpoint;

/**
 * @program: design-pattern
 * @author: cheungZ
 * @create: 2021-01-25 00:23
 * @description:
 **/
public class GetMainFactory {
    public static NullPoint get(NullPoint nullPoint){
        if (nullPoint!=null)
            return new MainClass();
        return new NullPointClass();
    }
}
