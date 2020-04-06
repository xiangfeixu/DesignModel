package com.feifei.factorypattern.multifactory;

import com.feifei.factorypattern.normalfactory.MailSender;
import com.feifei.factorypattern.normalfactory.Sender;
import com.feifei.factorypattern.normalfactory.SmsSender;

/**
 * 多个工厂方法模式
 * @author xuxiangfei
 * @date 2020/4/3
 */
public class MultiSendFactory {

    /**
     * 生产邮件发送
     * @return  邮件发送
     */
    public Sender produceMail() {
        return new MailSender();
    }

    /**
     * 生产短信邮件发送
     * @return  邮件发送
     */
    public Sender produceSms() {
        return new SmsSender();
    }
}
