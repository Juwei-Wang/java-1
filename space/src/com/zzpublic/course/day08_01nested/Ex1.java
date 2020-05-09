package com.zzpublic.course.day08_01nested;

import com.zzpublic.console.Console;

public class Ex1 {
    public static void main(String[] args) {
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        for (int i = 0; i < 5; i++) {
            int times = 5 - i;
            for (int j = 0; j < times; j++) {
                Console.print("* ");
            }
            Console.println();
        }

    }
}
