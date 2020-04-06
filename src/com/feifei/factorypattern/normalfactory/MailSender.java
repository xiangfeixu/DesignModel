package com.feifei.factorypattern.normalfactory;

/**
 * 邮件发送
 * @author xuxiangfei
 * @date 2020/4/3
 */
public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("send mail!!!");
    }
}
