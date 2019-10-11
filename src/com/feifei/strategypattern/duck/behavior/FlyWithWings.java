package com.feifei.strategypattern.duck.behavior;

/**
 * 使用翅膀飞的行为类
 * @author xuxiangfei
 * @date 2019/10/10
 */
public class FlyWithWings implements FlyBehavior {

    /**
     * 飞行方式
     */
    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
