package com.company.desinpattern.ChainOfResponisibility;

/**
 * 责任链模式
 */
public class Trouble {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
