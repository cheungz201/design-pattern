package com.cheungz.exterior;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-03-19 20:26
 * @Version: 0.0.1
 * @Description: 车载空调
 **/
public class AirConditioning {

    private static AirConditioning airConditioning;

    private AirConditioning(){}

    public static AirConditioning getInstance(){
        return airConditioning != null?airConditioning:new AirConditioning();
    }

    public void start(){
        System.out.println("启动车载空调！");
    }

    public void end(){
        System.out.println("关闭车载空调！");
    }
}
