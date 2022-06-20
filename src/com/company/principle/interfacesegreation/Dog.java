package com.company.principle.interfacesegreation;

/**
 * @author ：sjq
 * @date ：Created in 2022/3/9 3:50 PM
 * @description：
 * @modified By：
 * @version: $
 */
public class Dog implements IAnimalAction{
    @Override
    public void eat() {

    }

    /**
     * 狗不需要这个 这个版本不太行
     * 将这些方法分离成接口分离出去
     */
    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
