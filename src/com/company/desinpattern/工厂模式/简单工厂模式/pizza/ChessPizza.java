package com.company.desinpattern.工厂模式.简单工厂模式.pizza;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/14 11:06
 * @description：
 * @modified By：
 * @version: $
 */
public class ChessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备%s披萨".formatted(this.name));
    }
}
