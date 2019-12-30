package com.cxy.designpattern.strategy;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-30
 */
public class YellowDuck extends Duck {
    public YellowDuck() {
        this.flyable = new NormalFly();
    }
}
