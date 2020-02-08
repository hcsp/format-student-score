package com.github.hcsp.calculation;

import com.sun.org.apache.xpath.internal.objects.XString;

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
//        if (score > 100 || score < 0) {
//            return "非法输入";
//        }

        String level;

        switch (score / 10) {
            case 10:
                if (score % 10 > 0) {
                    return "非法输入";
                }
            case 9:
                level = "A";
                break;
            case 8:
            case 7:
            case 6:
                level = "B";
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                if (score % 10 < 0) {
                    return "非法输入";
                }
                level = "C";
                break;
            default:
                return "非法输入";
        }
        return "学生" + student + "的分数是" + score + "，评级是" + level;
    }

    public static void main(String[] args) {
        System.out.println(formatStudentScore("张三", -1));
        System.out.println(formatStudentScore("张三", 0));
        System.out.println(formatStudentScore("张三", 60));
        System.out.println(formatStudentScore("张三", 900));
    }
}
