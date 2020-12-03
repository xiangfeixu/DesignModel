package com.feifei.chainOfResponsibilityPattern.demoA;

/**
 * 处理者C,用来将字符c替换为*
 * @author xuxiangfei
 * @date 2020/12/3
 */
public class HandlerC extends AbstractHandler {
    @Override
    String handRequest(String msg) {
        if (msg.contains("c")) {
            msg = msg.replace('c', '*');
        } else if (successor != null) {
            msg = successor.handRequest(msg);
        }
        return msg;
    }
}
