package com.zk.gupao.observer_pattern.gperadvice;

public class GPerTest {
    public static void main(String[] args) {
        GPer gPer=GPer.getInstance();
        Teacher teacher=new Teacher("hello");
        Question question=new Question();
        question.setContent("asdasdasd");
        question.setUserName("zk");
        gPer.addObserver(teacher);
        gPer.publishQuestion(question);

    }

}