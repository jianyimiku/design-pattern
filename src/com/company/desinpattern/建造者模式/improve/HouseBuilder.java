package com.company.desinpattern.建造者模式.improve;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/23 16:33
 * @description：
 * @modified By：
 * @version: $
 */
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();


    public House buildHouse() {
        return house;
    }

}
