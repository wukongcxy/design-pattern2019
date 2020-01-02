package com.cxy.designpattern.state;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2020-01-02
 */
public class SellOutState implements State {
    @Override
    public boolean needInput() {
        return true;
    }

    @Override
    public State transmit() {
        System.out.println("state is " + this.getClass().toString());

        System.out.println("state is sell out, please go away!");
        return this;
    }
}
