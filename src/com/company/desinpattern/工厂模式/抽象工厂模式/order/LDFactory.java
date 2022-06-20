package com.company.desinpattern.工厂模式.抽象工厂模式.order;

import com.company.desinpattern.工厂模式.抽象工厂模式.pizza.LDChessPizza;
import com.company.desinpattern.工厂模式.抽象工厂模式.pizza.LDPepperPizza;
import com.company.desinpattern.工厂模式.抽象工厂模式.pizza.Pizza;

import java.util.Objects;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/20 14:47
 * @description：
 * @modified By：
 * @version: $
 */
public class LDFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (Objects.equals(orderType, "chess")) {
            pizza = new LDChessPizza();
        } else if (Objects.equals(orderType, "pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
