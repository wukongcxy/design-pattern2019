package com.cxy.designpattern.decorator;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-31
 */
public class Main {
    public static void main(String[] args) {
        Beverage hb = new HouseBlend();
        hb = new MochaDecorator(new MilkDecorator(hb));
        System.out.println(hb.getDesc());
        System.out.println(hb.cost());

    }

}
