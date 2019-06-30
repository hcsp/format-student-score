package com.github.hcsp.calculation;

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
        if (100 < score || score < 0) return "非法输入";
        int flag;
        if (90 <= score) {
            flag = FLAG;
        } else if (60 <= score) {
            flag = FLAG + 1;
        } else {
            flag = FLAG + 2;
        }
        String level = Integer.toHexString(flag).toUpperCase();
        return getResult(student, score, level);
    }
    
    public static int FLAG = 0b1010;
    
    public static String getResult(String student, int score, String level) {
        return "学生" + student + "的分数是" + score + "，评级是" + level;
    }

    public static void main(String[] args) {
        System.out.println(formatStudentScore("张三", -1));
        System.out.println(formatStudentScore("张三", 0));
        System.out.println(formatStudentScore("张三", 60));
        System.out.println(formatStudentScore("张三", 900));
    }
}
