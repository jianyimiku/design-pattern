package com.company.desinpattern.Bridge;

/**
 * @author ：sjq
 * @date ：Created in 2022/11/25 13:52
 * @description：类的层次实现
 * @modified By：
 * @version: $
 */
public class StringDisplayImpl implements Display {
    private String content;
    private int width;

    public StringDisplayImpl(String content) {
        this.content = content;
        this.width = content.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.print("|" + content + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }


    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
}
