package com.company.desinpattern.单例模式.静态常量饿汉式;

import com.company.desinpattern.单例模式.Single;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/14 09:56
 * @description：静态常量饿汉式
 * @modified By：
 * @version: $
 */
public class Singleton {
    public static final Single instance;

    static {
        instance = new Single();
    }

    private Singleton() {

    }

    public static Single getInstance() {
        return instance;
    }
}
