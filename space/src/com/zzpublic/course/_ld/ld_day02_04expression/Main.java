package com.zzpublic.course._ld.ld_day02_04expression;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = (1 + a) * a;
        // (1 + 2) * a
        // (3) * a
        // 3 * a
        // 3 * 2
        // 6


        // (1 + a) * a
        // (1 + 2) * 2
        // 3 * 2
        // 6

        // 1 + 3 + (2 + 1) * 3;
        // 4 + 3 * 3;
        // 4 + 9
        // 13

        // 1 + 3 + (2 + 1) * 3;
        // 4 + (2 + 1) * 3;
        // 4 + (3) * 3;
        // 4 + 3 * 3;
        // 4 + 9;
        // 13;
    }
}
