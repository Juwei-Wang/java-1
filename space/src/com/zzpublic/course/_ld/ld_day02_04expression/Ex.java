package com.zzpublic.course._ld.ld_day02_04expression;

import com.zzpublic.console.Console;

public class Ex {
    public static void main(String[] args) {
        /*

        >   2.3
        <   4

        // h = 1/2 gt^2
        // g = 9.8
        // 楼层高度 = 2米

         */

        double time = 2.3;
        double g = 9.8;
        double floorHeight = 2;
        double height = 0.5 * g * (time * time);
        int floor = (int)(height / floorHeight);

        // double h /= 2;
        // double h = double h / 2;
        // h /= 2

        Console.println(floor);


    }
}
