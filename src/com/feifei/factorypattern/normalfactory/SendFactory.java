package com.feifei.factorypattern.normalfactory;

/**
 * 发送工厂
 * @author xuxiangfei
 * @date 2020/4/3
 */
public class SendFactory {


    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型");
            return null;
        }
    }
}
