package com.cheungz.ohter;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-10-29 22:47
 * @description:
 **/
public class ArrayTest {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("123");
        stringList.add("zhangsan");
        stringList.add(" ");

        Stream<String> stream = stringList.stream();
        stream.forEach(b -> System.out.println(b));

        System.out.println("*********************");


    }
}
