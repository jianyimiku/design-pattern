package com.company.principle.openclose;

/**
 * @author ：sjq
 * @date ：Created in 2022/2/24 2:07 下午
 * @description：
 * @modified By：
 * @version: $
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse() {
    }

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
