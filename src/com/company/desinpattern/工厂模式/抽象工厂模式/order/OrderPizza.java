package com.company.desinpattern.工厂模式.抽象工厂模式.order;


import com.company.desinpattern.工厂模式.抽象工厂模式.pizza.Pizza;

import java.util.Scanner;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/20 14:48
 * @description：
 * @modified By：
 * @version: $
 */
public class OrderPizza {
    private AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void setSimpleFactory() {
        String orderType; // 订购披萨类型
        Scanner scanner = new Scanner(System.in);
        do {
            orderType = scanner.nextLine();
            Pizza pizza = abstractFactory.createPizza(orderType);
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
