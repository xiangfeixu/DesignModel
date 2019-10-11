package com.feifei.strategypattern.duck.behavior;

/**
 * 鸣叫
 * 定义鸣叫行为，由使用者具体实现
 * @author xuxiangfei
 * @date 2019/10/10
 */
public interface QuackBehavior {

    /**
     * 叫法
     */
    void quack();
}
