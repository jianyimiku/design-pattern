package com.company.principle.dependenceinversion.improve.someexample;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/8 14:59
 * @description：
 * @modified By：
 * @version: $
 */
public class Example {
    public static void main(String[] args) {
        IOPenAndClose openAndClose = new OpenAndClose();
        TypeTv typeTv = new TypeTv();
        openAndClose.open(typeTv);
    }
}

/**
 * 通过方法传入依赖
 *
 * 也可以使用构造器 set方法等
 */
interface IOPenAndClose {
    public abstract void open(ITV itv);
}

interface ITV {
    public void play();
}

class TypeTv implements ITV {
    @Override
    public void play() {

    }
}

class OpenAndClose implements IOPenAndClose {
    @Override
    public void open(ITV itv) {
        itv.play();
    }
}