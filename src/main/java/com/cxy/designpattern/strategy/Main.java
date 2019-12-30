package com.cxy.designpattern.strategy;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-30
 */
public class Main {
    public static void main(String[] args) {
        Duck d1 = new YellowDuck();
        Duck d2 = new GreenDuck();
        Duck d3 = new MutouDuck();
        d1.descript();
        d1.fly();
        d2.descript();
        d2.fly();
        d3.descript();
        d3.fly();
    }
}
