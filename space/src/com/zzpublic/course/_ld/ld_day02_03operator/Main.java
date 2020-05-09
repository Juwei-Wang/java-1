package com.zzpublic.course._ld.ld_day02_03operator;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        Console.println(11 / 4);    // int int -> int
        Console.println(11.0 / 4);    // double int -> double double -> double

        Console.println(11 % 4);    // 11 / 4 = 2 余 3
        // 用途
        //  0 1 2 3 4 5 6 7 8
        //  0 1 2 0 1 2 0 1 2

        // i will
        // i'll
        int count = 3;
        count = count + 1;
        // x = x ? y
        // x ?= y
        count += 1;

        count /= 2; // 对 count = count / 2;  错 count = 2 / count;

        // x += 1
        // x ++
        count++;
        // ++count
        // 单开一行
        // int a = count++;


    }
}
