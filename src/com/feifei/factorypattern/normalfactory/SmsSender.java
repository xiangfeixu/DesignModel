package com.feifei.factorypattern.normalfactory;

/**
 * 短信发送
 * @author xuxiangfei
 * @date 2020/4/3
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("send sms！！！");
    }
}
