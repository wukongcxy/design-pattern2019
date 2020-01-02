package com.cxy.designpattern.state;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2020-01-02
 */
public class NoHas25State implements State {
    @Override
    public boolean needInput() {
        return true;
    }

    @Override
    public State transmit() {
        System.out.println("state is " + this.getClass().toString());

        InputEnum input =StateVOTheadLocal.getThreadLocal().get().getInput();
        if (input == InputEnum.INPUT25) {
            System.out.println("input25 to transmit has25 state");
            return new Has25State();
        } else {
            System.out.println("input: " + input + " trigger nothing transmit");
        }
        return this;
    }
}
