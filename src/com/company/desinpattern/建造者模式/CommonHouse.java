package com.company.desinpattern.建造者模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/23 15:55
 * @description：
 * @modified By：
 * @version: $
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房子地基");
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
