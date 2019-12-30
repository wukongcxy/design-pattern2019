package com.cxy.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-30
 */
public class WeatherSubject implements ISubject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(11);
        }
    }
}
