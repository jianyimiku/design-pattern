package com.company.desinpattern.工厂模式.工厂模式.pizza;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/20 13:56
 * @description：
 * @modified By：
 * @version: $
 */
public class LDPepperPizza extends Pizza{

    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("准备伦敦胡椒Pizza");
    }
}
