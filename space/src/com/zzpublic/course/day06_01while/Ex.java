package com.zzpublic.course.day06_01while;

import com.zzpublic.console.Console;

public class Ex {
    public static void main(String[] args) {

        while (true){
            Console.printHeader2("Menu");
            Console.println("查询余额请按1");
            Console.println("退出请按0");

            int option = Console.readInt();

            if (option == 0) {
                Console.println("拜拜");
                break;

            } else if (option == 1) {
                Console.println("你的余额是0元");
            }
        }

        int option = 0;
        do {
            Console.printHeader2("Menu");
            Console.println("查询余额请按1");
            Console.println("退出请按0");
            option = Console.readInt();
        } while (option != 0);
        Console.println("拜拜");

    }
}
