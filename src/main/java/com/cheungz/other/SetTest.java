package com.cheungz.other;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-04-22 20:53
 * @Version: 1.0.0
 * @Description:
 **/
public class SetTest {

    private int val;


    public SetTest(int val) {
        this.val = val;
    }

    /*@Override
    public int hashCode() {
        return Objects.hashCode(val);
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }*/

    public static void main(String[] args) {

        /*SetTest setTest = new SetTest(1);
        SetTest setTest1 = new SetTest(1);*/


        Set set = new HashSet();
        set.add(1000);
        set.add(1000);
        set.add(null);
        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b);
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
