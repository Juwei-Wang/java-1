package com.zzpublic.course.day13_02format;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        String template = "%-4d.";
        String str = String.format(template,  2);
        Console.println(str);
    }
}
