package com.company.desinpattern.装饰者模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/6 21:36
 * @description：装饰者抽象类
 * @modified By：
 * @version: $
 */
public abstract class Decorator implements Drink {
    protected Drink drink;

    protected int cost;

    protected String description;

    public Decorator() {

    }

    public Decorator(Drink drink, int cost,String description) {
        this.drink = drink;
        this.cost = cost;
        this.description = description;
    }
}
