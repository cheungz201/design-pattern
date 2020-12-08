package com.cheungz.factory;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-11-12 12:36
 * @description:
 **/
public class HuaWeiFactory implements CommodityFactory {
    @Override
    public Commodity getCommodity() {
        return new HuaWei();
    }
}
