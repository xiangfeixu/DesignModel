package com.feifei.observerpattern.jdk;


import java.util.Observable;

/**
 * 天气数据对象
 * 使用JDK提供的可观察者超类，提供观察者的注册、移除、通知的功能
 * @author xuxiangfei
 * @date 2019/10/29
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {}



    /**
     * 气象站参数发生变换时，通知观察者
     */
    public void measurementsChanged() {
        setChanged();
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

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ConcurrentConditionsDisplay display = new ConcurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(34.0f, 95.9f, 20f);
    }
}
