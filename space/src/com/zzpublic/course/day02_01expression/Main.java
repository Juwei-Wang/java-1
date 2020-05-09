package com.zzpublic.course.day02_01expression;

public class Main {
    public static void main(String[] args) {
        // 双目运算符 + - * / % += -= etc.
        // 单目运算符 ++ --
        // 三目运算符

        // 双目运算符，左右两边 加空格

//        int a=3+2;
//        int b = 3 + 2;

        int a = 10;
        int result = (a + 1) * a;

        /*
        int result = (a + 1) * a;
        int result = (10 + 1) * a;
        int result = (11) * a;
        int result = 11 * a;
        int result = 11 * 10;
        int result = 110;
        <- 110;
         */

        int r2 = 10 - 8 - 2;

        /*

        int r2 = 10 - 8 - 2;
        int r2 = 2 - 2;
        int r2 = 0;


         */


        int r3 = 10 - (8 % 3);




    }
}
