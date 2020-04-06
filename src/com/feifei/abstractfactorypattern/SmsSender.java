package com.feifei.abstractfactorypattern;

/**
 * 短信发送
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class SmsSender implements Sender{

    @Override
    public void sender() {
        System.out.println("发送短信");
    }
}
