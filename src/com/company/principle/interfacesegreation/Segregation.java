package com.company.principle.interfacesegreation;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/2 15:14
 * @description：不遵守接口隔离原则
 * @modified By：
 * @version: $
 */
public class Segregation {

}

/**
 * 这个接口里面有5个方法 CLASSB 和 CLASSD实现这个接口
 */
interface Interface {
    public abstract void operation1();

    public abstract void operation2();

    public abstract void operation3();

    public abstract void operation4();

    public abstract void operation5();
}

class B implements Interface {
    @Override
    public void operation1() {
        System.out.println("B opertaion1");
    }

    @Override
    public void operation2() {
        System.out.println("B opertaion2");
    }

    @Override
    public void operation3() {
        System.out.println("B opertaion3");
    }

    @Override
    public void operation4() {
        System.out.println("B opertaion4");
    }

    @Override
    public void operation5() {
        System.out.println("B opertaion5");
    }
}

class D implements Interface {

    @Override
    public void operation1() {
        System.out.println("C opertaion1");
    }

    @Override
    public void operation2() {
        System.out.println("C opertaion2");
    }

    @Override
    public void operation3() {
        System.out.println("C opertaion3");
    }

    @Override
    public void operation4() {
        System.out.println("C opertaion4");
    }

    @Override
    public void operation5() {
        System.out.println("C opertaion5");
    }
}

/**
 * Class A 和 Class C 依靠interface接口关联了B 和 D
 * 并且只使用了B D中的部分方法
 *
 * 类A 与 类C 依赖的接口不是所需要的最小接口
 */
class A {
    public void dependent1(Interface b) {
        b.operation1();
    }

    public void dependent2(Interface b) {
        b.operation2();
    }
}

class C {
    public void dependent3(Interface d) {
        d.operation3();
    }

    public void dependent4(Interface d) {
        d.operation4();
    }
}
