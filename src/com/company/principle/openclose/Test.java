package com.company.principle.openclose;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ：sjq
 * @date ：Created in 2022/2/24 2:08 下午
 * @description：
 * @modified By：
 * @version: $
 */
public class Test {
    private static final Logger logger = Logger.getLogger(Test.class.getCanonicalName());

    public static void main(String[] args) {
        ICourse iCourse = new JavaCourse(96, "开闭原则", 300.00);
        System.out.println(iCourse.getId());
    }
}
