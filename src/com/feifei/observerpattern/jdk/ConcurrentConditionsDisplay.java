package com.feifei.observerpattern.jdk;

import com.feifei.observerpattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 当前情况展示
 * @author xuxiangfei
 * @date 2019/10/29
 */
public class ConcurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable observable;

    /**
     * 有参构造器
     * @param observable 可观察者对象
     */
    public ConcurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 更新本地消息
     * @param obs   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            humidity = weatherData.getHumidity();
            temperature = weatherData.getTemperature();
            display();
        }
    }


    @Override
    public void display() {
        System.out.println("Current Conditions:" + temperature + "F degrees," + "Humidity:" + humidity + "% humidity");
    }
}
