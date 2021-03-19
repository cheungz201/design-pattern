package com.cheungz.exterior;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-03-19 20:28
 * @Version: 0.0.1
 * @Description:
 **/
public class Sound {
    private static Sound sound;

    private Sound(){}

    public static Sound getInstance(){
        return sound != null?sound:new Sound();
    }

    public void start(){
        System.out.println("启动车载音响！");
    }

    public void end(){
        System.out.println("关闭车载音响！");
    }
}
