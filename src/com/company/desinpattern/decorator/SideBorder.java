package com.company.desinpattern.decorator;

public class SideBorder extends Border {
    private char charBorder;

    public SideBorder(Display display, char charBorder) {
        super(display);
        this.charBorder = charBorder;
    }

    @Override
    public Integer getCols() {
        return 1 + display.getCols() + 1;
    }

    @Override
    public Integer getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return charBorder + display.getRowText(row) + charBorder;
    }
}
