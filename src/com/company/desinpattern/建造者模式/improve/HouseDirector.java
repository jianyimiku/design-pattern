package com.company.desinpattern.建造者模式.improve;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/23 16:37
 * @description：这个可有可无 StringBuilder也是建造者模式
 * @modified By：
 * @version: $
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
