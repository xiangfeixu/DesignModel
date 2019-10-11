package com.feifei.strategypattern.duck.behavior;

/**
 * 嘎嘎叫
 * @author xuxiangfei
 * @date 2019/10/11
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack!!");
    }
}
