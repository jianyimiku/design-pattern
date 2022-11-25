package com.company.desinpattern.建造者模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/23 15:54
 * @description：将产品和产品建造过程解耦
 * @modified By：
 * @version: $
 */
public abstract class AbstractHouse {
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
