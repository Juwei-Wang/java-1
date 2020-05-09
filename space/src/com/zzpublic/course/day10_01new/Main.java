package com.zzpublic.course.day10_01new;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        printMenu();

        int command = Console.readInt();

        while (command != 0){
            double value1 = Console.readDouble();
            double value2 = Console.readDouble();
            double result = 0.0;

            if (command == 1) {
                result = value1 + value2;

            } else if (command == 2) {
                result = value1 - value2;

            } else if (command == 3) {
                result = value1 * value2;

            } else if (command == 4) {
                result = value1 / value2;
            }

            Console.println(result);

            printMenu();

            command = Console.readInt();
        }
    }

    public void printMenu() {
        Console.println("请选择操作");
        Console.println("1.  加法");
        Console.println("2.  减法");
        Console.println("3.  乘法");
        Console.println("4.  除法");
        Console.println("0.  退出");
    }
}
