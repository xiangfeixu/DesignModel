package com.feifei.observerpattern.weather;

import com.feifei.observerpattern.DisplayElement;
import com.feifei.observerpattern.Observer;
import com.feifei.observerpattern.Subject;

/**
 * @author xuxiangfei
 * @date 2019/10/28
 */
public class ConcurrentConditionsDisplay implements Observer, DisplayElement {


    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ConcurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 更新状态
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 压力
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("current Conditions:" + temperature + "F degrees And " + humidity + "% humidity");
    }
}
