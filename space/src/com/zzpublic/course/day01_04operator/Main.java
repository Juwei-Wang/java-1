package com.zzpublic.course.day01_04operator;

import com.zzpublic.console.Console;

public class Main {
    //psvm
    public static void main(String[] args) {

        int a = 1 + 2;
        Console.println(a);

        int b = a * 5;
        Console.println(b);

        Console.println(7 / 8);

        Console.println(4.0 / 8.0);

        Console.println(4.0 / 8);

        Console.println(3 % 4);
        Console.println(4 % 4);
        Console.println(5 % 4);
        Console.println(6 % 4);

        //  0 1 2 3 4 5 6 7 8
        //  0 1 2 3 0 1 2 3 0


        int count = 1;
        count = count + 1;

        // I will -> I'll
        count += 1;

        count = 8;
        count -= 2;

        count = 8;
        count = 16 / count; // -> count /= 16;

        count += 1;

        count = 100;
        count -= 1;

        count ++;
        count --;









    }
}
