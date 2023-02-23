package com.company.desinpattern.decorator;

import java.nio.charset.StandardCharsets;

public class StringDisplay implements Display {
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public Integer getCols() {
        return string.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public Integer getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        return string;
    }
}
