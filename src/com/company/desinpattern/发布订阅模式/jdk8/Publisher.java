package com.company.desinpattern.发布订阅模式.jdk8;

import java.util.Observable;
import java.util.Random;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/7 20:57
 * @description：
 * @modified By：
 * @version: $
 */
public class Publisher extends Observable {
    protected Random random = new Random();
    protected int number;

    public void action() {
        number = random.nextInt(10);
        setChanged();
        notifyObservers(this);
    }
}
