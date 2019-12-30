package com.cxy.designpattern.strategy;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-30
 */
public class NullFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
