package com.company.desinpattern.ChainOfResponisibility.execise.one;

public abstract class Click {
    // 点击的输入框类型
    private ClickEnumType clickType;

    public ClickEnumType getClickType() {
        return clickType;
    }

    public void setClickType(ClickEnumType clickType) {
        this.clickType = clickType;
    }
}
