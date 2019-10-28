package com.feifei.observerpattern.weather;

import com.feifei.observerpattern.Subject;

/**
 * 气象站
 * 用来模拟气象数据编码所有观察者都能及时接受变化
 * @author xuxiangfei
 * @date 2019/10/28
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ConcurrentConditionsDisplay currentdisplay = new ConcurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 90 , 67.9f);
    }
}
