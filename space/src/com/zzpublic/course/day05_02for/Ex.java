package com.zzpublic.course.day05_02for;

import com.zzpublic.console.Console;

public class Ex {
    public static void main(String[] args) {
        /*

        1.
            5
            4
            3
            2
            1
        2.
            1 3 5 7 9
        3.
            * * * * *
            Console.print();
         */

        {
            // 1.
            for (int i = 0; i < 5; i++) {
                Console.println(5 - i);
            }
            for (int i = 5; i >= 1; i++) {
                Console.println(i);
            }
        }
        {
            // 2.
            for (int i = 0; i < 5; i++) {
                int num = i * 2 + 1;
                Console.println(num);
            }

            for (int i = 1; i < 10; i += 2) {
                Console.println(i);
            }

            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    Console.println(i);
                }
            }
        }
        {
            // 3.
            for (int i = 0; i < 10; i++) {

            }

        }
    }
}
