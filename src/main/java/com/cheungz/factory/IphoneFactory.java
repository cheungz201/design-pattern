package com.cheungz.factory;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-11-12 12:35
 * @description:
 **/
public class IphoneFactory implements CommodityFactory {
    @Override
    public Commodity getCommodity() {
        return new Iphone();
    }
}
