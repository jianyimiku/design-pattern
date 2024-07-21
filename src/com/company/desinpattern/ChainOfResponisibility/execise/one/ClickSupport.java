package com.company.desinpattern.ChainOfResponisibility.execise.one;

import com.company.desinpattern.ChainOfResponisibility.Support;

public abstract class ClickSupport {
    private String name;

    private ClickSupport next;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClickSupport getNext() {
        return next;
    }

    public ClickSupport setNext(ClickSupport next) {
        this.next = next;
        return next;
    }

    /**
     * 支持自定义support方法
     *
     * @param click
     */
    public void support(Click click) {
        if (supportResolve(click)) {
            this.done(click);
        } else if (next != null) {
            next.support(click);
        } else {
            this.fail(click);
        }
    }

    /**
     * 判断是否需要处理
     *
     * @param click
     * @return
     */
    public abstract boolean supportResolve(Click click);

    /**
     * 执行函数
     *
     * @param click
     */
    public abstract void done(Click click);


    /**
     * 转移函数
     *
     * @param click
     */
    public abstract void fail(Click click);
}
