package com.feifei.builderpattern.secondmethod;

import java.util.StringJoiner;

/**
 * 产品-》麦当劳套餐
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class Product {

    private String buildA = "汉堡";
    private String buildB = "饮料";
    private String buildC = "薯条";
    private String buildD = "甜品";

    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public String getBuildD() {
        return buildD;
    }

    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("buildA='" + buildA + "'")
                .add("buildB='" + buildB + "'")
                .add("buildC='" + buildC + "'")
                .add("buildD='" + buildD + "'")
                .add("组成套餐")
                .toString();
    }
}
