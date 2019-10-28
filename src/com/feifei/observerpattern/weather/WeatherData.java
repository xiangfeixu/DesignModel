package com.feifei.observerpattern.weather;

import com.feifei.observerpattern.Observer;
import com.feifei.observerpattern.Subject;

import java.util.ArrayList;

/**
 * 天气数据
 * @author xuxiangfei
 * @date 2019/10/28
 */
public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * 注册观察者
     *
     * @param observer 观察者
     */
    @Override
    public synchronized void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer 观察者
     */
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }

    }

    /**
     * 气象站参数发生变换时，通知观察者
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 气象参数setter方法
     * @param temperature 温度
     * @param humidity  湿度
     * @param pressure  压力
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}