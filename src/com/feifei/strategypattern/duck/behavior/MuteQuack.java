package com.feifei.strategypattern.duck.behavior;

/**
 * 闷声叫
 * @author xuxiangfei
 * @date 2019/10/11
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<Silence>zzz");
    }
}
