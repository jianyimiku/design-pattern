package com.company.desinpattern.工厂模式.工厂方法模式.order;

import com.company.desinpattern.工厂模式.工厂方法模式.pizza.BJChessPizza;
import com.company.desinpattern.工厂模式.工厂方法模式.pizza.BJPepperPizza;
import com.company.desinpattern.工厂模式.工厂方法模式.pizza.Pizza;

import java.util.Objects;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/20 14:01
 * @description：
 * @modified By：
 * @version: $
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (Objects.equals(orderType, "chess")) {
            pizza = new BJChessPizza();
        } else if (Objects.equals(orderType, "pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
