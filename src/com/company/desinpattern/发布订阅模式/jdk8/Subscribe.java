package com.company.desinpattern.发布订阅模式.jdk8;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/7 21:00
 * @description：
 * @modified By：
 * @version: $
 */
public class Subscribe implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Publisher publisher = (Publisher) arg;
        System.out.println(publisher.number);
    }
}
