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
        String Student_score;
        String Score_string;
        if(score>= 60 && score <= 89){
            Score_string = String.format("学生X的分数是%d，评级是%s",score,"B");
        }else if (score >= 0 && score <=59){
            Score_string = String.format("学生X的分数是%d，评级是%s",score,"C");
        }else if (score >= 90 && score <= 100){
            Score_string = String.format("学生X的分数是%d，评级是%s",score,"A");
        }else{
            Score_string = "非法输入";
        }
        return Score_string;
    }

    public static void main(String[] args) {
        System.out.println(formatStudentScore("张三", -1));
        System.out.println(formatStudentScore("张三", 0));
        System.out.println(formatStudentScore("张三", 60));
        System.out.println(formatStudentScore("张三", 900));
    }
}
