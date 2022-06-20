package com.company.desinpattern.工厂模式.简单工厂模式.order;

import com.company.desinpattern.工厂模式.简单工厂模式.pizza.ChessPizza;
import com.company.desinpattern.工厂模式.简单工厂模式.pizza.GreekPizza;
import com.company.desinpattern.工厂模式.简单工厂模式.pizza.Pizza;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/14 11:35
 * @description：简单工厂
 * @modified By：
 * @version: $
 */
public class SimpleFactory {
    /**
     * 使用简单工厂模式
     *
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        System.out.println("简单工厂模式");
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
            pizza.setName(type);
        } else if ("chess".equals(type)) {
            pizza = new ChessPizza();
            pizza.setName(type);
        }
        return pizza;
    }


    /**
     * 简单工厂也可以成为静态工厂模式
     * @param type
     * @return
     */
    public static Pizza createPizza2(String type) {
        Pizza pizza = null;
        System.out.println("简单工厂模式");
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
            pizza.setName(type);
        } else if ("chess".equals(type)) {
            pizza = new ChessPizza();
            pizza.setName(type);
        }
        return pizza;
    }
}
