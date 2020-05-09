package com.zzpublic.course.day12_02char;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        {
            char c = '1';
            int a = c;
            Console.println(c);
            Console.println(a);

            String str = "zzax";
            String str1 = "z";
            String str2 = "";
            // 数组存在，但是数组里没元素
            // int[] arr = new int[0];
        }
        {
            int a2 = 20116;
            char c2 = (char) a2;
            Console.println(a2);
            Console.println(c2);
        }

        {
            char a = 'A';
            int page = a;
            page += 1;
            char b = (char)page;
            Console.println(b);
        }
        {
            Console.println((char)('A' + 1));
            char a = 'A';
//            a += 1;
//            a = (char)(a + 1);
//            a = a + 1;
        }
        {
            Console.println((char)('C' + ('a' - 'A')));
        }
        {
//            char c1 = ''';
//            String s1 = """;
            char c1 = '\'';
            String s1 = "\"";
            Console.println(c1);

            char c2 = '\\';
            Console.println(c2);
        }
        {
            Console.println("a\nb");

            Console.print(1);
            Console.print('\n');
            Console.print(2);
            Console.print("a\n");
            Console.println(3);
            Console.println(4);
        }
        {
            Console.println("a\tb");
            Console.println("aa\tb");
            Console.println("aaa\tb");
            Console.println("aaaa\tb");
            Console.println("aaaaa\tb");
            Console.println("\tif {");
            Console.println("\t\tint a;");
            Console.println("\t}");
            Console.println("    }");
        }
        {
            Console.println("\u8D75\u54F2");
            Console.println("a\u0301"); // aá
        }
    }
}




























