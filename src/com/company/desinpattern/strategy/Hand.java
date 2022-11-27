package com.company.desinpattern.strategy;

public class Hand implements Comparable<Hand> {
    public static final int HANDVALUE_GUU = 0;
    public static final int HANDVALUE_CHO = 1;
    public static final int HANDVALUE_PAA = 2;

    private static Hand[] hands;

    private static final String[] name = new String[]{
            "Rock", "Scissors", "Cloth"
    };


    static {
        hands = new Hand[]{
                new Hand(HANDVALUE_GUU),
                new Hand(HANDVALUE_CHO),
                new Hand(HANDVALUE_PAA)
        };
    }

    private int handvalue;

    public Hand(int handvalue) {
        this.handvalue = handvalue;
    }


    public static Hand getHand(int handvalue) {
        return hands[handvalue];
    }


    @Override
    public String toString() {
        return name[handvalue];
    }

    @Override
    public int compareTo(Hand o) {
        if (this == o) {
            return 0;
            // 石头 大于 剪刀 大于 布
        } else if (((this.handvalue + 1) % 3 == o.handvalue)) {
            return 1;
        } else {
            return -1;
        }
    }

    public boolean isStrongThan(Hand o) {
        return this.compareTo(o) > 0;
    }

    public boolean isWeakerThan(Hand o) {
        return this.compareTo(o) < 0;
    }
}
