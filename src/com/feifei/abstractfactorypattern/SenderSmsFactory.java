package com.feifei.abstractfactorypattern;

/**
 * 短信发送工厂类
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class SenderSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
