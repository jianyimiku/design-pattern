package com.company.desinpattern.工厂模式.简单工厂模式.order;

import com.company.desinpattern.工厂模式.简单工厂模式.pizza.Pizza;

import java.util.Scanner;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/14 11:11
 * @description：定购披萨
 * @modified By：
 * @version: $
 */
public class OrderPizza {
    private SimpleFactory simpleFactory;

    public OrderPizza() {
        setSimpleFactory(new SimpleFactory());
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;

        String orderType; // 订购披萨类型
        Scanner scanner = new Scanner(System.in);
        do {
            orderType = scanner.nextLine();
            Pizza pizza = simpleFactory.createPizza(orderType);
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
