package com.feifei.strategypattern.duck;

import com.feifei.strategypattern.duck.behavior.FlyNoWay;
import com.feifei.strategypattern.duck.behavior.Quack;

/**
 * 模型鸭（嘎嘎叫，不会飞）
 * @author xuxiangfei
 * @date 2019/10/11
 */
public class ModelDuck extends BaseDuck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    /**
     * 模型鸭
     */
    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
