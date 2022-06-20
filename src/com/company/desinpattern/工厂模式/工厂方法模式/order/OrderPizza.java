package com.company.desinpattern.工厂模式.工厂方法模式.order;

import com.company.desinpattern.工厂模式.工厂方法模式.pizza.Pizza;

import java.util.Scanner;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/14 11:11
 * @description：定购披萨
 * @modified By：
 * @version: $
 */
public abstract class OrderPizza {

    public abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购披萨类型
        Scanner scanner = new Scanner(System.in);
        do {
            orderType = scanner.nextLine();
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("定购Pizza失败");
            }
        } while (true);
    }
}
