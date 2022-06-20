package com.company.desinpattern.工厂模式.抽象工厂模式.pizza;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/14 11:00
 * @description：Pizza接口
 * @modified By：
 * @version: $
 */
public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + ":bake");
    }

    public void cut() {
        System.out.println(name + ":cut");
    }

    public void box() {
        System.out.println(name + ":box");
    }

    public void setName(String name) {
        this.name = name;
    }
}
