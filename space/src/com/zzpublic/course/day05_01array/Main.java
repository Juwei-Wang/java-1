package com.zzpublic.course.day05_01array;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {

        int number = Console.readInt();

        int[] units = new int[3];

        for(int i = 0; i < 3; i ++) {
            units[i] = number % 10;
            number = number / 10;
        }

        Console.println(units[2]);
        Console.println(units[1]);
        Console.println(units[0]);

        {
            for(;Math.random() > 0.1;) {

            }

        }
    }
}
