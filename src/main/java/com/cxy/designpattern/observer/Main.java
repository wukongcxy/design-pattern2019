package com.cxy.designpattern.observer;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2019-12-30
 */
public class Main {


    public static void main(String[] args) {
        Observer home = new HomeObserver();
        Observer school = new SchoolObserver();
        ISubject weatherSubject = new WeatherSubject();
        weatherSubject.registerObserver(home);
        weatherSubject.registerObserver(school);
        weatherSubject.notifyObservers();
    }


}
