package com.company.desinpattern.ChainOfResponisibility.execise.one;

/**
 * 点击输入框类型
 */
public enum ClickEnumType {
    TEXTBOX("文本框"),
    CHECKBOX("选择框");
    private String name;

    ClickEnumType(String name) {
        this.name = name;
    }
}
