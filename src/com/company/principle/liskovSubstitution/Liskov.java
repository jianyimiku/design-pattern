package com.company.principle.liskovSubstitution;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/8 15:45
 * @description：里式替换--有问题的
 * @modified By：
 * @version: $
 */
public class Liskov {
    public static void main(String[] args) {
        // 因为子类重写了方法 所以替换的时候会出现问题
        A a = new B();
        System.out.println(a.fun(1, 2));
    }
}

class A {
    public int fun(int a, int b) {
        return a + b;
    }
}

class B extends A {
    @Override
    public int fun(int a, int b) {
        return a - b;
    }
}
