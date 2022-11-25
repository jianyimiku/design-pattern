package com.company.desinpattern.建造者模式.improve;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/23 16:35
 * @description：
 * @modified By：
 * @version: $
 */
public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
