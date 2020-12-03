package com.feifei.chainOfResponsibilityPattern.demoA;

/**
 * 处理者B，用来将字符b替换为*号
 * @author xuxiangfei
 * @date 2020/12/3
 */
public class HandlerB extends AbstractHandler {
    @Override
    String handRequest(String msg) {
        if (msg.contains("b")) {
            msg = msg.replace('b', '*');
        } else if (successor != null) {
            msg = successor.handRequest(msg);
        }
        return msg;
    }
}
