package com.cheungz.other;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: More
 * @author: Zhang Zhe
 * @create: 2021-03-03 10:30
 * @version: 0.0.1
 * @description:
 **/
public class MapEntryTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("张三",18);
        map.put("李四",19);
        /*Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next()+" = "+map.get(iterator.next()));*/


        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey()+" = "+entry.getValue());
    }
}
