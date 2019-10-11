package com.feifei.strategypattern.duck.behavior;

/**
 * 没法飞行的行为
 * 给不能飞的鸭子使用
 * @author xuxiangfei
 * @date 2019/10/10
 */
public class FlyNoWay implements FlyBehavior {
    /**
     * 飞行方式
     */
    @Override
    public void fly() {
        System.out.println("I can't fly....");
    }
}
