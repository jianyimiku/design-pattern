package com.company.principle.openclose;

/**
 * @author ：sjq
 * @date ：Created in 2022/2/24 2:06 下午
 * @description：开闭原则演示接口
 * @modified By：
 * @version: $
 */
public interface ICourse {
    public abstract Integer getId();

    public abstract String getName();

    public abstract Double getPrice();
}
