package com.company.principle.singlereponsibility;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/2 14:33
 * @description：
 * @modified By：
 * @version: $
 */
public class SingleResponsibilityI {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 违背了单一职责原则 因为又管理了地上跑的 也还有天上飞的
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑...");
    }
}
