package com.company.principle.liskovSubstitution.improve;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/8 15:49
 * @description：
 * @modified By：
 * @version: $
 */
public class LiskVo {

}

// 对A与B实现解耦 将公共方法提取到一个公共类中
abstract class Base {
    public int func(int a, int b) {
        return a + b;
    }
}

class A extends Base {

}

class B extends Base {
    // 这时候如果想用A 就 构造器 方法传参 set方法传入
}
