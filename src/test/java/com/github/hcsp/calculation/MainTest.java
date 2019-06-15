package com.github.hcsp.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        Assertions.assertEquals("非法输入", Main.formatStudentScore("", -1));
        Assertions.assertEquals("非法输入", Main.formatStudentScore("", 101));

        int score1 = new java.util.Random().nextInt(59);
        Assertions.assertEquals(
                "学生张三的分数是" + score1 + "，评级是C", Main.formatStudentScore("张三", score1));

        int score2 = new java.util.Random().nextInt(10) + 60;
        Assertions.assertEquals(
                "学生张三的分数是" + score2 + "，评级是B", Main.formatStudentScore("张三", score2));

        int score3 = new java.util.Random().nextInt(10) + 90;
        Assertions.assertEquals(
                "学生张三的分数是" + score3 + "，评级是A", Main.formatStudentScore("张三", score3));
    }
}
