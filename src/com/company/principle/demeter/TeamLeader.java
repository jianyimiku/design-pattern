package com.company.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：sjq
 * @date ：Created in 2022/3/9 4:19 PM
 * @description：
 * @modified By：
 * @version: $
 */
public class TeamLeader {
    public void checkNumberOfCourses() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("在线课程的数量:" + courses.size());
    }
}
