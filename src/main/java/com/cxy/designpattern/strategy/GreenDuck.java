package com.cxy.designpattern.strategy;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-30
 */
public class GreenDuck extends Duck {
    public GreenDuck() {
        this.flyable = new NormalFly();
    }
}
