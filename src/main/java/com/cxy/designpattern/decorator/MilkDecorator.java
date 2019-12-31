package com.cxy.designpattern.decorator;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-31
 */
public class MilkDecorator extends CondimentDecorator {
    public MilkDecorator(Beverage beverage) {
        this.beverageWarpper = beverage;
    }

    @Override
    public String getDesc() {
        return "add milk" + this.beverageWarpper.getDesc();
    }

    @Override
    public float cost() {
        return 2f + this.beverageWarpper.cost();
    }
}
