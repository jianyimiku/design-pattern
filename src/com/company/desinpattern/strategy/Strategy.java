package com.company.desinpattern.strategy;

public interface Strategy {
    /**
     * 下一次要出手的手势
     * @return
     */
    public abstract Hand nextHand();

    /**
     * 判断下一次要出手的手势
     * @param win
     */
    public abstract void study(boolean win);
}
