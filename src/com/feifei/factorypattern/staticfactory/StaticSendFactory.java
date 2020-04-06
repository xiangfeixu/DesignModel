package com.feifei.factorypattern.staticfactory;

import com.feifei.factorypattern.normalfactory.MailSender;
import com.feifei.factorypattern.normalfactory.Sender;
import com.feifei.factorypattern.normalfactory.SmsSender;

/**
 * 静态工厂方法
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class StaticSendFactory {

    /**
     * 获取短信发送实例
     * @return 短信发送实例对象
     */
    public static Sender produceSms() {
        return new SmsSender();
    }

    /**
     * 获取邮件发送实例
     * @return 邮件发送实例对象
     */
    public static Sender produceMail() {
        return new MailSender();
    }
}
