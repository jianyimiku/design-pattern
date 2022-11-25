package com.company.desinpattern.装饰者模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/6 21:31
 * @description：Component 需要装饰的核心对象接口
 * @modified By：
 * @version: $
 */
public interface Drink {
    public abstract String getDescription();

    public abstract int getCost();
}
