package com.company.desinpattern.Bridge;

/**
 * @author ：sjq
 * @date ：Created in 2022/11/25 13:59
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    public static void main(String[] args) {
        PrintDisplay printDisplay = new PrintDisplay(new StringDisplayImpl("Hello, China."));
        CountPrintDisplay countPrintDisplay = new CountPrintDisplay(new StringDisplayImpl("Hello, World."));
        printDisplay.display();
        System.out.println();
        countPrintDisplay.multiDisplay(5);
    }
}
