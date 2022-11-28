package com.company.desinpattern.Bridge;

/**
 * @author ：sjq
 * @date ：Created in 2022/11/25 13:57
 * @description：
 * @modified By：
 * @version: $
 */
public class CountPrintDisplay extends PrintDisplay {

    public CountPrintDisplay(Display display) {
        super(display);
    }


    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
