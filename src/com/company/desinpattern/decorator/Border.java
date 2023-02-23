package com.company.desinpattern.decorator;

public abstract class Border implements Display {
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
