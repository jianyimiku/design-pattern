package com.company.desinpattern.状态模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/14 21:01
 * @description：
 * @modified By：
 * @version: $
 */
public class OrderSuccessState implements State {
    public static final OrderSuccessState INSTANCE = new OrderSuccessState();

    @Override
    public void update(Order order, OrderTypeEnum orderTypeEnum) {
        if (orderTypeEnum.equals(OrderTypeEnum.NOT_PAY)) {
            // TODO 支付
            order.changeState(orderTypeEnum);
        }
    }
}
