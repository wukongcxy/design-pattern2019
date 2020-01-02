package com.cxy.designpattern.state;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2020-01-02
 */
public class Has25State implements State {
    @Override
    public boolean needInput() {
        return true;
    }

    @Override
    public State transmit() {
        System.out.println("state is " + this.getClass().toString());
        InputEnum input =StateVOTheadLocal.getThreadLocal().get().getInput();
        if (input == InputEnum.OUTPUT25) {
            System.out.println("output25 to transmit nohas25 state");
            return new NoHas25State();
        } else if (input == InputEnum.TURN) {
            System.out.println("trun to transmit sell state");
            return new SellState();
        }
        else {
            System.out.println("input: " + input + " trigger nothing transmit");
        }
        return this;
    }
}
