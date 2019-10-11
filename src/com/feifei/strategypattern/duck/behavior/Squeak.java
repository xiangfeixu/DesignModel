package com.feifei.strategypattern.duck.behavior;

/**
 * 吱吱叫
 * @author xuxiangfei
 * @date 2019/10/11
 */
public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
