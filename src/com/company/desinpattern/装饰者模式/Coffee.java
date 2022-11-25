package com.company.desinpattern.装饰者模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/6 21:33
 * @description：这个类加的缓冲 方便扩展而已
 * @modified By：
 * @version: $
 */
public abstract class Coffee implements Drink {
    protected String description;

    protected int cost;

    public Coffee() {
    }

    public Coffee(String description, int cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
