package com.feifei.observerpattern;

/**
 * 主题类
 * 可以用来注册和移除观察者对象，更新状态并通知所有观察者
 * @author xuxiangfei
 * @date 2019/10/28
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
