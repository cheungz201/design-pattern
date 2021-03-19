package com.cheungz.other;

import java.io.*;

/**
 * @program: More
 * @description
 * @author: z'z
 * @create: 2020-09-05 17:39
 **/
public class IoTest {

    public static void main(String[] args) {

        String msg = "IO TEST MESSAGE";
        byte bytes[];
        bytes = msg.getBytes();
        File file = new File("D:/下载文件/test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                FileOutputStream outputStream = new FileOutputStream(file);
                OutputStream a;
                outputStream.write(bytes);
                System.out.println("写入完成");
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
