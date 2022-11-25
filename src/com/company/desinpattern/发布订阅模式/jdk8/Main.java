package com.company.desinpattern.发布订阅模式.jdk8;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/7 21:01
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscribe subscribe = new Subscribe();
        publisher.addObserver(subscribe);
        publisher.action();
    }
}
