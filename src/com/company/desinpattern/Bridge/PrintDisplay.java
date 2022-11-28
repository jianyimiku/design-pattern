package com.company.desinpattern.Bridge;

/**
 * @author ：sjq
 * @date ：Created in 2022/11/25 13:55
 * @description：类的功能层次
 * @modified By：
 * @version: $
 */
public class PrintDisplay {
    private Display display;

    public PrintDisplay(Display display) {
        this.display = display;
    }

    public void open() {
        display.rawOpen();
    }

    public void print() {
        display.rawPrint();
    }

    public void close() {
        display.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
