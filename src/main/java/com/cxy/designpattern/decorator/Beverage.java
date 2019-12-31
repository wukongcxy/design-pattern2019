package com.cxy.designpattern.decorator;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-31
 */
public abstract class Beverage {
    private String desc;
    public abstract String getDesc();
    public abstract float cost();
}
