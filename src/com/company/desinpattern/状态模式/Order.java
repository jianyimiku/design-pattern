package com.company.desinpattern.状态模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/14 21:00
 * @description：
 * @modified By：
 * @version: $
 */
public class Order {
    private State state = OrderSuccessState.INSTANCE;

    public void changeState(OrderTypeEnum orderTypeEnum) {
        state.update(this, orderTypeEnum);
    }
}
