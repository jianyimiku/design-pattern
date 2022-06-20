package com.company.desinpattern.工厂模式.工厂模式.pizza;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/20 13:55
 * @description：
 * @modified By：
 * @version: $
 */
public class LDChessPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦北京奶酪Pizza");
    }
}
