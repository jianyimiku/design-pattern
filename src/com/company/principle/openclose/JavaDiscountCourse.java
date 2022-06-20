package com.company.principle.openclose;

/**
 * @author ：sjq
 * @date ：Created in 2022/2/24 2:18 下午
 * @description：如果要计算打折 遵循开闭原则 对扩展开放
 * @modified By：
 * @version: $
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse() {
    }

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
