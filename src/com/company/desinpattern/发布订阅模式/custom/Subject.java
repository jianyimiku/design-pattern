package com.company.desinpattern.发布订阅模式.custom;

import java.util.ArrayList;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/7 20:53
 * @description：被观察者
 * @modified By：
 * @version: $
 */
public abstract class Subject {
    protected ArrayList<CustomObserve> arrayList = new ArrayList<>(10);

    public void add(CustomObserve observe) {
        arrayList.add(observe);
    }

    public abstract void action();
}
