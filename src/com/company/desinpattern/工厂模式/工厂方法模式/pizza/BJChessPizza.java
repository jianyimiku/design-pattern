package com.company.desinpattern.工厂模式.工厂方法模式.pizza;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/20 13:55
 * @description：
 * @modified By：
 * @version: $
 */
public class BJChessPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("准备北京奶酪Pizza");
    }
}
