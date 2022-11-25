package com.company.desinpattern.装饰者模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/6 21:43
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    public static void main(String[] args) {
        Drink drink = new ChocolateDecorator(new MilkDecorator(
                new CommonCoffee("普通咖啡", 20), 5, "牛奶"
        ), 10, "巧克力");
        System.out.println(drink.getDescription());
        System.out.println(drink.getCost());
    }
}
