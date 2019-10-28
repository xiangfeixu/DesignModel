package com.feifei.observerpattern;

/**
 * 观察者
 * 所有观察者对象都应该实现该接口
 * 用来接收主题状态信息的变化
 * @author xuxiangfei
 * @date 2019/10/28
 */
public interface Observer {

    /**
     * 更新状态
     * @param temp  温度
     * @param humidity  湿度
     * @param pressure  压力
     */
    void update(float temp, float humidity, float pressure);
}
