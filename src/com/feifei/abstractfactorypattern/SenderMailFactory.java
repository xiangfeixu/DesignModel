package com.feifei.abstractfactorypattern;

/**
 * 邮件发送工厂类
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class SenderMailFactory implements Provider{

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
