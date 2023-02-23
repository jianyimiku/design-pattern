package com.company.desinpattern.工厂模式.简单工厂模式.pizza;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/14 11:10
 * @description：
 * @modified By：
 * @version: $
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.printf("准备%s披萨%n", this.name);
    }
}
