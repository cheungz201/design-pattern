package com.cheungz.ohter;

/**
 * @program: More
 * @author: z'z
 * @create: 2020-10-27 22:33
 * @description:
 **/
public class DebugTest {
    public String myPrintf(String str){
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        System.out.println("begin");
        DebugTest a = new DebugTest();
        if (a.myPrintf("success").equals("success"))
            System.out.println("end");
        else
            System.out.println("fail");
    }
}
