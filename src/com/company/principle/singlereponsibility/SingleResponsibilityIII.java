package com.company.principle.singlereponsibility;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/2 14:33
 * @description：
 * @modified By：
 * @version: $
 */
public class SingleResponsibilityIII {
    public static void main(String[] args) {
        VehicleIII vehicle = new VehicleIII();
        vehicle.run("汽车");
    }
}


/**
 * 没有对类遵守单一职责,但是对方法遵守单一职责
 * 但是如果对于每个交通工具有很多的方法 那么还是要对类进行拆分
 */
class VehicleIII {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天上飞...");
    }
}