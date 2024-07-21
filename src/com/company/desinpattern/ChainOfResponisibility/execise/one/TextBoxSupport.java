package com.company.desinpattern.ChainOfResponisibility.execise.one;


public class TextBoxSupport extends ClickSupport {

    @Override
    public boolean supportResolve(Click click) {
        if (ClickEnumType.TEXTBOX.equals(click.getClickType())) {
            return true;
        }
        return false;
    }

    @Override
    public void done(Click click) {
        // do something
    }

    @Override
    public void fail(Click click) {
        throw new UnsupportedOperationException("找不到支持该视窗的操作");
    }
}
