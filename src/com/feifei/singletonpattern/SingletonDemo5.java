package com.feifei.singletonpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记式单例实现
 * 类似spring里的方法，将类名注册，下次直接取
 * @author xuxiangfei
 * @date 2019/8/28
 */
public class SingletonDemo5 {

    private static Map<String, SingletonDemo5> map = new HashMap<String, SingletonDemo5>();

    static {
        SingletonDemo5 instance = new SingletonDemo5();
        map.put(instance.getClass().getName(), instance);
    }

    /**
     * 保护默认构造器
     */
    private SingletonDemo5(){}

    public static SingletonDemo5 getInstance(String name) {

        if (name == null) {
            name = SingletonDemo5.class.getName();
            System.out.println("name == null " + "--> name = " + name);
        }

        if (map.get(name) == null) {
            try {
                map.put(name, (SingletonDemo5) Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

        return map.get(name);
    }

    public String about() {
        return "Hello I'm Singleton";
    }

    public static void main(String[] args) {
        SingletonDemo5 instance = SingletonDemo5.getInstance(null);
        System.out.println(instance.about());
    }

}
