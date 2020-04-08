package com.feifei.builderpattern.firstmethod;

import java.util.StringJoiner;

/**
 * 产品类
 * 本例中相当于房子
 * @author xuxiangfei
 * @date 2020/4/6
 */
public class Product {

    private String buildA;
    private String buildB;
    private String buildC;
    private String buildD;

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
                .add("房子验收完成")
                .toString();
    }
}
