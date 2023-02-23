package com.company.desinpattern.decorator;

public class Main {
    public static void main(String[] args) {
        Display stringDisplay = new StringDisplay("hello world");
        Display sideBorderDisplay = new SideBorder(stringDisplay,
                '|');
        sideBorderDisplay.show();
    }
}
