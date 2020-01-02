package com.cxy.designpattern.state;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2020-01-02
 */
public class StateVO {
    private int count = 10;
    private InputEnum input;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public InputEnum getInput() {
        return input;
    }

    public void setInput(InputEnum input) {
        this.input = input;
    }
}
