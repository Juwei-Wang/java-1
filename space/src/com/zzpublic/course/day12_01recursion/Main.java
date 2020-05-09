package com.zzpublic.course.day12_01recursion;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        int a = f(3);
        int b = f(1);
        Console.println(a + b);
    }

    public int f(int value) {
        if(value == 1) {
            return 1;
        }
        Console.println(value);
        return f(value - 1) + 1;
    }

    // i++, i < 10
}

/*
    run()
    +   int a = f(3);

        \
        f(3) -> value = 3
        +   if(value == 1) {
        +   return f(value)? + 1;
        +   return f(2)? + 1;

            \
            f(2) -> value = 2
            +   if(value == 1) {
            +   return f(1)? + 1;

                \
                f(1) -> value = 1
                +   if(1 == 1) {
                +       return 1;
                /

            +   return 1 + 1;
            +   return 2;
            /

        +   return 2 + 1;
        +   return 3;
        /

    +   int a = 3;
    +   int b = f(1);

        \
        f(1) -> value = 1
        +   if(1 == 1) {
        +       return 1;
        /

    +   int b = 1;



*/























