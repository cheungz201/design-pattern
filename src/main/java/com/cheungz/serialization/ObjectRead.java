package com.cheungz.serialization;

import java.io.*;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-11-08 17:21
 * @description:
 **/
public class ObjectRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("序列化测试");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("D:/下载文件/test.txt")));
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student);
    }
}
