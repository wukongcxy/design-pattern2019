package com.cxy.designpattern.decorator;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-31
 */
public class DarkRoast extends Beverage {
    @Override
    public String getDesc() {
        return "Dark Roast";
    }

    @Override
    public float cost() {
        return 3f;
    }
}
