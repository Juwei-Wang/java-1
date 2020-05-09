package com.zzpublic.course.day10_02func;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run(){
        int a = 1;
        Console.println(a);
        int b = f(a);
        Console.println(a);
        Console.println(b);
    }

    public int f(int a){   // 参数
        Console.println(a);
        a++;
        Console.println(a);
        return a;
    }
}
