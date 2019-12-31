package com.cxy.designpattern.decorator;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-31
 */
public class HouseBlend extends Beverage{
    @Override
    public String getDesc() {
        return "House Blend";
    }

    @Override
    public float cost() {
        return 2f;
    }
}
