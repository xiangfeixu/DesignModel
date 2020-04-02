package com.feifei.proxypattern.dynamic.jdk;

/**
 * 猎狗
 * @author xuxiangfei
 * @date 2020/4/2
 */
public class GunDog implements IDog{

    @Override
    public void run() {
        System.out.println("猎狗再跑！！！！");
    }
}
