package com.zzpublic.course.day05_02for;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        String name = "赵哲Public";

        // i-? [0, 3)
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }

        //

        // 1
        Console.println(1);
        Console.println(2);
        Console.println(3);
        Console.println(4);

        // Console.println( )

        // 1 2 3 4


        for (int i = 0; i < 4; i++) {       //填次数
            int value = i + 1;
            Console.println(value);              // 填相同的代码
        }

        // 找规律
        // i -> 1 2 3 4

        //  i 0 1 2 3
        //  v 1 2 3 4

    }
}
