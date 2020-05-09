package com.zzpublic.course.day10_01new;

import com.zzpublic.console.Console;

public class Ex {
    public static void main(String[] args) {
        new Ex().run();
    }

    public void run() {
        Console.println("1");
        f();
        Console.println("2");
        h();
        Console.println("3");
    }

    public void f() {
        Console.println("4");
        g();
        Console.println("5");
        h();
        Console.println("6");
    }

    public void g() {
        Console.println("7");
    }

    public void h() {
        Console.println("8");
        g();
        Console.println("9");
    }
}
