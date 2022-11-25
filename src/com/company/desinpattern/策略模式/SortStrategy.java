package com.company.desinpattern.策略模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/3 21:05
 * @description：策略模式接口
 * @modified By：
 * @version: $
 */
public interface SortStrategy {
    /**
     * 该策略模式主要是给数组进行排序
     * @param nums
     */
    void sort(int[] nums);
}
