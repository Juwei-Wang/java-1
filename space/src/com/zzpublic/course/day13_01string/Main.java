package com.zzpublic.course.day13_01string;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        {
            String str = "zzax";
            int length = str.length();
            Console.println(length);

            char c = str.charAt(0);
            Console.println(c);

            int index = str.indexOf('a');
            Console.println(index);

            String substring = str.substring(2, 3);
            Console.println(substring);
        }
        {
            String path = "/User/zhaozhe/desktop/haha.c";
            int index = path.indexOf('.');
            String extension = path.substring(index + 1);
            Console.println(extension);
            //  .jpeg .html
            //  .md
            //  .c
            //  .java
            //  .class

            //  "/User/.key/key.txt"
            //  "/User/key.mx.txt

        }

    }
}
