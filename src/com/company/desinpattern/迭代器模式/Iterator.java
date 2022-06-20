package com.company.desinpattern.迭代器模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/2/26 5:21 下午
 * @description：迭代器接口
 * @modified By：
 * @version: $
 */
public interface Iterator<T> {
    /**
     * 判断是否有下一个元素
     * @return
     */
    public boolean hasNext();

    /**
     * 拿出下一个元素
     * @return
     */
    public T next();
}
