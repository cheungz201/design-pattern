package com.cheungz.exterior;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-03-19 20:38
 * @Version: 0.0.1
 * @Description:
 **/
public class CarComputer {

    AirConditioning airConditioning;
    Sound sound;

    //获取车载设备的实例
    public CarComputer(){
        airConditioning = AirConditioning.getInstance();
        sound = Sound.getInstance();
    }

    //开启设备
    public void startDevice(){
        airConditioning.start();
        sound.start();
    }

    //关闭设备
    public void endDevice(){
        airConditioning.end();
        airConditioning.end();
    }
}
