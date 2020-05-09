package com.zzpublic.course.day02_05random;

public class Main {
    public static void main(String[] args) {
        double value = Math.random();
        // value 为 [0, 1) 之间的随机小数

        int digit = (int)(value * 10);
        // digit 变为 [0, 10) 之间的随机整数

        System.out.println(digit);

        // 0 - 9
        // value = [0, 1) double
        // value = [0, 10) double
        // value = [0, 9] int

    }
}
