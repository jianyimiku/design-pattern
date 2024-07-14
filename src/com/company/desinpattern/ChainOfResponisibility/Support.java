package com.company.desinpattern.ChainOfResponisibility;

/**
 * 责任链接口
 */
public abstract class Support {
    private String name;

    private Support next;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Support getNext() {
        return next;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    /**
     * 支持自定义support方法
     *
     * @param trouble
     */
    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            this.done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            this.fail(trouble);
        }
    }

    /**
     * 判断是否需要处理
     *
     * @param trouble
     * @return
     */
    public abstract boolean resolve(Trouble trouble);

    /**
     * 执行函数
     *
     * @param trouble
     */
    public abstract void done(Trouble trouble);


    /**
     * 转移函数
     *
     * @param trouble
     */
    public abstract void fail(Trouble trouble);


}
