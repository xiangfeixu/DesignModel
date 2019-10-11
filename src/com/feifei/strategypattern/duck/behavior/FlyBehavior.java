package com.feifei.strategypattern.duck.behavior;

/**
 * 所有飞行行为类必须实现的接口
 * 定义飞行行为，由使用者具体实现
 * @author xuxiangfei
 * @date 2019/10/10
 */
public interface FlyBehavior {

    /**
     * 飞行方式
     */
    void fly();
}
