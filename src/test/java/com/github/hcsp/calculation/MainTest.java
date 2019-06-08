package com.github.hcsp.calculation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        assertEquals("非法输入", Main.formatStudentScore("", -1));
        assertEquals("非法输入", Main.formatStudentScore("", 100));

        int score1 = new java.util.Random().nextInt(59);
        assertEquals("学生张三的分数是" + score1 + "，评级是C", Main.formatStudentScore("张三", score1));

        int score2 = new java.util.Random().nextInt(10) + 60;
        assertEquals("学生张三的分数是" + score2 + "，评级是B", Main.formatStudentScore("张三", score2));

        int score3 = new java.util.Random().nextInt(10) + 90;
        assertEquals("学生张三的分数是" + score3 + "，评级是C", Main.formatStudentScore("张三", score3));
    }
}
