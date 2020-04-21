package com.feifei.singletonpattern;

/**
 * 使用枚举实现单例
 * @author xuxiangfei
 * @date 2020/4/21
 */
public enum SingtonDemo6 {

    /**
     * 实例一
     */
    Instance_One("111", "222");


    private String name;

    private String height;

    SingtonDemo6(String name, String height) {

    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }
}
