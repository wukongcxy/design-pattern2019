package com.cxy.designpattern.strategy;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-30
 */
public abstract class Duck {
    protected Flyable flyable;
    public void descript() {
        System.out.println("I'm duck!");
    }
    public void fly() {
        flyable.fly();
    }
}
