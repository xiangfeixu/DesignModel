package com.feifei.strategypattern.duck.behavior;

/**
 * 火箭动力飞行方式
 * @author xuxiangfei
 * @date 2019/10/11
 */
public class FlyRocketPowered implements FlyBehavior {

    /**
     * 飞行方式:火箭动力
     */
    @Override
    public void fly() {
        System.out.println("I'm flying with rocker!!!");
    }
}
