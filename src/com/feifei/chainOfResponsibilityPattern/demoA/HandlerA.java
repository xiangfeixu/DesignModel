package com.feifei.chainOfResponsibilityPattern.demoA;

/**
 * 处理者A，用来将字符a替换为*
 * @author xuxiangfei
 * @date 2020/12/3
 */
public class HandlerA extends AbstractHandler {

    @Override
    String handRequest(String msg) {
        if (msg.contains("a")) {
            msg = msg.replace('a', '*');
        } else if (successor != null) {
            msg = successor.handRequest(msg);
        }
        return msg;
    }
}
