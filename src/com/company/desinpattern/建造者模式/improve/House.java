package com.company.desinpattern.建造者模式.improve;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/23 16:33
 * @description：
 * @modified By：
 * @version: $
 */
public class House {
    private String baise;
    private String wall;
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
