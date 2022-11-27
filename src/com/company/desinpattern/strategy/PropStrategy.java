package com.company.desinpattern.strategy;

import java.math.BigDecimal;

/**
 * 根据当前所有的胜利的概率来进行确定出哪个
 */
public class PropStrategy implements Strategy{

    @Override
    public Hand nextHand() {
        return null;
    }

    @Override
    public void study(boolean win) {

    }
}
