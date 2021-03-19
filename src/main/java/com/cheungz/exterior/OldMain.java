package com.cheungz.exterior;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-03-19 20:35
 * @Version: 0.0.1
 * @Description:
 **/
public class OldMain {

    public static void main(String[] args) {

        //获取车载外围设备对象
        AirConditioning airConditioning = AirConditioning.getInstance();
        Sound sound = Sound.getInstance();

        //启动外围设备对象
        airConditioning.start();
        sound.start();

        //关闭车载外围对象
        airConditioning.end();
        sound.end();
    }
}
