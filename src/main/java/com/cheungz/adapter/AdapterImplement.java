package com.cheungz.adapter;


/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-12-01 20:18
 * @description:
 **/

public class AdapterImplement implements Adapter {
    private TypeC typeC;

    public AdapterImplement(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void recharge() {
        typeC.recharge();
    }
}
