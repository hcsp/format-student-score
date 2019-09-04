package com.github.hcsp.calculation;

public class Main {
    /**
     * 输入学生姓名和分数，当： 90<=score<=100分时，返回"学生X的分数是Y，评级是A"；
     * <p>
     * <p>60<=score<=89时，返回"学生X的分数是Y，评级是B"；
     * <p>
     * <p>0<=score<=59时，返回"学生X的分数是Y，评级是C"；
     * <p>
     * <p>score为其他值时，返回"非法输入"。
     *
     * @param student 学生的姓名
     * @param score   学生的分数
     * @return 结果字符串
     */
    public static String formatStudentScore(String student, int score) {
        if (score < 0 || score > 100) {
            return "非法输入";
        } else if (score >= 90 && score <= 100) {
            return "学生" + student + "的分数是" + score + ",评级是A";
        } else if (score >= 60) {
            return "学生" + student + "的分数是" + score + ",评级是B";
        } else {
            return "学生" + student + "的分数是" + score + ",评级是C";
        }

    }

    public static void main(String[] args) {
        System.out.println(formatStudentScore("张三", -1));
        System.out.println(formatStudentScore("张三", 0));
        System.out.println(formatStudentScore("张三", 60));
        System.out.println(formatStudentScore("张三", 900));
    }
}
