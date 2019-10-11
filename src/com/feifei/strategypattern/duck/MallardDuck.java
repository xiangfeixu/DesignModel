package com.feifei.strategypattern.duck;

import com.feifei.strategypattern.duck.behavior.FlyWithWings;
import com.feifei.strategypattern.duck.behavior.Quack;

/**
 * 绿头鸭(嘎嘎叫、能飞)
 * 在子类中使用构造器初始化父类中声明的接口引用，指定其具体实现类
 * @author xuxiangfei
 * @date 2019/10/11
 */
public class MallardDuck extends BaseDuck {


    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    /**
     * 鸭子共性特征：外貌
     */
    @Override
    public void display() {
        System.out.println("I'm a real MallardDuck!");
    }
}
