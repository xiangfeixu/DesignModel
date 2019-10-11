package com.feifei.strategypattern.duck;

import com.feifei.strategypattern.duck.behavior.FlyBehavior;
import com.feifei.strategypattern.duck.behavior.QuackBehavior;

/**
 * 鸭子抽象超类，定义鸭子的共性行为，外貌和游泳
 * 在策略模式中，将易变的部分抽离出来用，使用组合的形式用接口代替，然后在子类中为其设置实现类
 * 在超类中，不需要关注某些行为如何实现，只需要关注具有这种行为即可
 * 多用组合，少用继承：使用组合会使系统具有很大的弹性，不仅可以将算法族封装成类，而且还可以“运行期间动态的修改它”
 * @author xuxiangfei
 * @date 2019/10/10
 */
public abstract class BaseDuck {

    /**
     * 飞行方式
     * 声明一个引用，由子类实例化
     */
    protected FlyBehavior flyBehavior;

    /**
     * 鸣叫方式
     */
    protected QuackBehavior quackBehavior;

    /**
     * 鸭子共性特征：外貌
     */
    public abstract void display();

    /**
     * 鸭子共性行为：游泳
     */
    public void swim() {
        System.out.println("All duck float,even delcoys!");
    }

    /**
     * 鸭子个性行为：飞行
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 鸭子个性行为：鸣叫
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**************************改造，增加setter方法****************************/

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}



