package com.cheungz.serialization;

import java.io.*;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-11-08 17:16
 * @description:
 **/
public class SerializationMain {
    public static void main(String[] args) throws IOException {
        System.out.println("This is Serialization Test");
        File file = new File("D:/下载文件/test.txt");
        OutputStream out = new FileOutputStream(file);
        ObjectOutputStream  objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(new Student());
        System.out.println("end");
    }
}
