package com.zzpublic.course.day13_01string;

import com.zzpublic.console.Console;

import java.util.Scanner;

public class Issue {
    public static void main(String[] args) {
        new Issue().run();
    }
    public void run() {
        System.out.println("hello");
        Console.println("hello");

        // 1024
        // 1024\n
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int v2 = scanner.nextInt();
        System.out.println(value);
        System.out.println(v2);
//        scanner.nextLine();
//        String line = scanner.nextLine();
//        System.out.println(line);

        /*
            等待用输入 xxxx 之后 按回车
            scanner 就要从输入队列去找信息
            nextInt 找数  -> 1024
                scanner 把 所有连续的数 取走
                返回 对应的数
                >   1024
                q   1024\n
                scanner.nextInt();
                q   \n
                return 1024

            nextLine 找换行符 ->
                scanner 把 换行符前面所有 + 换行符 取走
                返回 换行符前面的
                >   1024
                q   1024\n
                scanner.nextLine
                q   空了
                return "1024"


         */
//        int value = Console.readInt();
//        String line = Console.nextLine();
//        Console.println(value);
//        Console.println(line);

    }
}
