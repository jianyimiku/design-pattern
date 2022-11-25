package com.company.desinpattern.状态模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/14 20:07
 * @description：
 * @modified By：
 * @version: $
 */
public interface State {
    public abstract void update(Order order,OrderTypeEnum orderTypeEnum);
}
