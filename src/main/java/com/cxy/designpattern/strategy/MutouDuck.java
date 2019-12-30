package com.cxy.designpattern.strategy;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-30
 */
public class MutouDuck extends Duck {
    public MutouDuck() {
        this.flyable = new NullFly();
    }
}
