package com.company.desinpattern.strategy;

import java.util.Random;

/**
 * 只要赢了 下一次还出一样的手势
 */
public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    @Override
    public Hand nextHand() {
        // 上一次没赢
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }


    @Override
    public String toString() {
        return "use the winning strategy";
    }
}
