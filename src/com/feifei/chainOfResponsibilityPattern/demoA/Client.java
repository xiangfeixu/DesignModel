package com.feifei.chainOfResponsibilityPattern.demoA;

/**
 * 客户端
 * <p>客户端代码中，可以灵活设置整个链路和处理者的次序，
 * 然后直接调用第一个处理者的handleRequest方法，就相当于启动了整个链路。</p>
 * <p>Note:<ol>
 *         <li>责任链模式可以大大提升任务处理的灵活性</li>
 *         <li>改变任务处理流程，只需要在客户端重新配置链路，添加删除Handler或者改变Handler的次序即可</li>
 *  </ol>
 * </p>
 *  web项目开发中的filter就是基于责任链模式，详见代码{@code javax.servlet.Filter#doFilter}
 *  此外，还有springMVC中的DispatcherServlet分发请求到对应的controller之前执行的各个拦截器Interceptor处理流程，
 *  也是责任链模式的实现
 * @author xuxiangfei
 * @date 2020/12/3
 */
public class Client {

    public static void main(String[] args) {
        // 创建责任处理器
        AbstractHandler handlerA = new HandlerA();
        AbstractHandler handlerB = new HandlerB();
        AbstractHandler handlerC = new HandlerC();

        // 定义责任链 A -> B -> C
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        // 开启责任链处理
        System.out.println(handlerA.handRequest("apple"));
        System.out.println(handlerA.handRequest("bicycle"));
        System.out.println(handlerA.handRequest("color"));
    }
}
