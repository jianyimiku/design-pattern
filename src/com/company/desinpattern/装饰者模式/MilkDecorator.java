package com.company.desinpattern.装饰者模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/6 21:37
 * @description：具体的装饰者
 * @modified By：
 * @version: $
 */
public class MilkDecorator extends Decorator {
    /**
     * 需要装饰的物品 和 装饰品的价格
     *
     * @param drink
     * @param cost
     */
    public MilkDecorator(Drink drink, int cost, String description) {
        super(drink, cost, description);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + "装饰上了:" + description;
    }

    @Override
    public int getCost() {
        return drink.getCost() + cost;
    }
}
