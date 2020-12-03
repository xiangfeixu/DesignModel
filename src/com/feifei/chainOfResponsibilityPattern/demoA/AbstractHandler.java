package com.feifei.chainOfResponsibilityPattern.demoA;

/**
 * 抽象处理者
 * <P>该示例用来将字符替换为*号，匹配到合适的处理者后责任链结束</P>
 * <P>如果传入的消息字符串包含某个字母，则把对应的字母替换成*。
 * 一旦某个Handler替换了自己所负责的字母，就直接结束整个链路；如果没有自己所负责的字母，
 * 则指定下一个Handler继续处理。</P>
 * @author xuxiangfei
 * @date 2020/12/3
 */
public abstract class AbstractHandler {

    protected AbstractHandler successor;

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求
     * @param msg 消息
     * @return 处理后结果值
     */
    abstract String handRequest(String msg);
}
