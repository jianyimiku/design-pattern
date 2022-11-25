package com.company.desinpattern.状态模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/14 21:00
 * @description：
 * @modified By：
 * @version: $
 */
public enum OrderTypeEnum {
    NOT_PAY(0,"未支付");


    private Integer code;
    private String name;

    OrderTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
