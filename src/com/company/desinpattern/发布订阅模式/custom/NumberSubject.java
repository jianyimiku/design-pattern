package com.company.desinpattern.发布订阅模式.custom;

import java.util.Random;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/7 20:55
 * @description：当这个目标对象的状态发生变化时，所有依赖于它的观察者对象都会得到通知并执行它们各自特有的行为。
 * @modified By：
 * @version: $
 */
public class NumberSubject extends Subject {
    Random random = new Random();

    int number;

    @Override
    public void action() {
        number = random.nextInt(10);
        for (CustomObserve customObserve : arrayList) {
            customObserve.update(this);
        }
    }
}
