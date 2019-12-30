package com.cxy.designpattern.strategy;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-30
 */
public class NormalFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("fly Anywhere!");
    }
}
