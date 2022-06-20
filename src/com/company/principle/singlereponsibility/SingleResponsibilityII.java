package com.company.principle.singlereponsibility;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/2 14:33
 * @description：
 * @modified By：
 * @version: $
 */
public class SingleResponsibilityII {
    public static void main(String[] args) {
        RoadVehicle vehicle = new RoadVehicle();
        vehicle.run("汽车");
    }
}


/**
 * 将类进行拆分 但是开销比较大
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑...");
    }
}

class FlyVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上飞...");
    }
}
