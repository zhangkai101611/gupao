package com.zk.gupao.template_pattern.course;

public class NetWorkCourseTest {
    public static void main(String[] args) {
        System.out.println("---Java架构师课程---");
        NetWorkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("---大数据课程---");
        NetWorkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }

}