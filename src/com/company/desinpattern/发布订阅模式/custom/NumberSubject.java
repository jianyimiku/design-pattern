package com.company.desinpattern.发布订阅模式.custom;

import java.util.Random;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/7 20:55
 * @description：
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
