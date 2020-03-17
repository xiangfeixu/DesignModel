package com.feifei.observerpattern.jdk;

/**
 * @author xuxiangfei
 * @date 2020/3/17
 */
public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ConcurrentConditionsDisplay display = new ConcurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(10.0f,100.0f, 1000.0f);

    }
}
