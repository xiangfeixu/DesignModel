package com.feifei.strategypattern.duck;

import com.feifei.strategypattern.duck.behavior.FlyRocketPowered;

/**
 * 绿头鸭测试类
 * @author xuxiangfei
 * @date 2019/10/11
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        // 通过父类提供的setter方法可以动态修改其飞行行为
        BaseDuck duck = new ModelDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }
}
