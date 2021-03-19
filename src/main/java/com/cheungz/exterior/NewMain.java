package com.cheungz.exterior;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-03-19 20:43
 * @Version: 0.0.1
 * @Description:
 **/
public class NewMain {

    public static void main(String[] args) {
        CarComputer carComputer = new CarComputer();  //获取车载电脑
        carComputer.startDevice();  //开启车载电脑控制的设备
        carComputer.endDevice();  //关闭车载电脑控制的设备
    }
}
