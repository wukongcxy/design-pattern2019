package com.cxy.designpattern.observer;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-30
 */
public interface ISubject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
