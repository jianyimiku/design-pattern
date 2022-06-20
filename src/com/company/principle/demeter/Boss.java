package com.company.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：sjq
 * @date ：Created in 2022/3/9 4:03 PM
 * @description：迪米特法则 Controller层直接将入参交给service 不用自己处理
 * @modified By：
 * @version: $
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader) {
//        List<Course> courses = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            courses.add(new Course());
//        }
        teamLeader.checkNumberOfCourses();
    }
}
