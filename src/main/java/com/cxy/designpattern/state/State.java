package com.cxy.designpattern.state;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2020-01-02
 */
public interface State {
    boolean needInput();
    State transmit();
}
