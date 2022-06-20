package com.company.desinpattern.工厂模式.抽象工厂模式.order;

import com.company.desinpattern.工厂模式.抽象工厂模式.pizza.Pizza;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/20 14:46
 * @description：
 * @modified By：
 * @version: $
 */
public interface AbstractFactory {
    Pizza createPizza(String orderType);
}
