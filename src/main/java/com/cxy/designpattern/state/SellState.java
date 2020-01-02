package com.cxy.designpattern.state;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2020-01-02
 */
public class SellState implements State {
    @Override
    public boolean needInput() {
        return false;
    }

    @Override
    public State transmit() {
        System.out.println("state is " + this.getClass().toString());

        int count =StateVOTheadLocal.getThreadLocal().get().getCount();
        if (count > 0) {
            System.out.println("count > 0, sell 1 and transmit no25");
            return new NoHas25State();
        } else if (count <= 0) {
            System.out.println("count <=0, sell 0 and transmit sell out");
            return new SellOutState();
        }
        return this;
    }
}
