package com.company.desinpattern.decorator;

/**
 * 接口
 */
public interface Display {
    /**
     * 获取单行的字符数
     *
     * @return
     */
    public abstract Integer getCols();

    /**
     * 获取行数
     *
     * @return
     */
    public abstract Integer getRows();

    /**
     * 获取单行的字符串
     *
     * @return
     */
    public abstract String getRowText(int row);


    public default void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
