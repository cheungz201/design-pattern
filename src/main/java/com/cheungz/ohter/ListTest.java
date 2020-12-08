package com.cheungz.ohter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: More
 * @author: z'z
 * @create: 2020-10-07 20:14
 * @description:
 **/
public class ListTest {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("sss");
        s.add("ssvc");
        s.add("lll");
        Iterator<String> it = s.iterator();
        for (;it.hasNext();){
            System.out.println(it.next());
        }

    }
}
