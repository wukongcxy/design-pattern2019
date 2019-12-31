package com.cxy.designpattern.decorator;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-31
 */
public class MochaDecorator extends CondimentDecorator {
    public MochaDecorator(Beverage beverage) {
        this.beverageWarpper = beverage;
    }

    @Override
    public String getDesc() {
        return "Mocha " + this.beverageWarpper.getDesc();
    }

    @Override
    public float cost() {
        return 4f + this.beverageWarpper.cost();
    }
}
