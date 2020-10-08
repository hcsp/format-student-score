package com.github.hcsp.calculation;

import java.text.MessageFormat;

public class Main {
    /**
     * 输入学生姓名和分数，当： 90<=score<=100分时，返回"学生X的分数是Y，评级是A"；
     *
     * <p>60<=score<=89时，返回"学生X的分数是Y，评级是B"；
     *
     * <p>0<=score<=59时，返回"学生X的分数是Y，评级是C"；
     *
     * <p>score为其他值时，返回"非法输入"。
     *
     * @param student 学生的姓名
     * @param score 学生的分数
     * @return 结果字符串
     */
    public static String formatStudentScore(String student, int score) {
        // 评级
        String level;

        if (90 <= score && score <= 100) {
            level = "A";
        } else if (60 <= score && score <= 89) {
            level = "B";
        } else if (0 <= score && score <= 59) {
            level = "C";
        } else {
            return "非法输入";
        }

        return MessageFormat.format("学生{0}的分数是{1}，评级是{2}", student, score, level);
    }

    public static void main(String[] args) {
        System.out.println(formatStudentScore("张三", -1));
        System.out.println(formatStudentScore("张三", 0));
        System.out.println(formatStudentScore("张三", 60));
        System.out.println(formatStudentScore("张三", 900));
    }
}
