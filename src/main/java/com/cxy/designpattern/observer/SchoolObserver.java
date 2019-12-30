package com.cxy.designpattern.observer;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-30
 */
public class SchoolObserver implements Observer {
    @Override
    public void update(Integer temp) {
        System.out.println("School temp is " + temp);
    }
}
