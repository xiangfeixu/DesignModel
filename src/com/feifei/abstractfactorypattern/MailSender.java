package com.feifei.abstractfactorypattern;

/**
 * 邮件发送
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class MailSender implements Sender {
    @Override
    public void sender() {
        System.out.println("正在发送邮件");
    }
}
