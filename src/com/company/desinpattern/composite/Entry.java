package com.company.desinpattern.composite;

/**
 * 组合模式 行为具有一致性 可以包含 比如文件和文件夹 将它们统一的是Entry
 */
public abstract class Entry {
    /**
     * 获取文件或者文件夹的名字
     * @return
     */
    public abstract String getName();

    /**
     * 打印出文件名或者文件夹下面所有的文件名称
     * @return
     */
    public abstract void printAllFileNames();
    protected abstract void printAllFileNames(String prefix);

    /**
     * 返回文件或者文件夹的大小
     * @return
     */
    public abstract Integer getSize();
}
