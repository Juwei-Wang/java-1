package com.zzpublic.course.day07_02code;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        /*
        31
        6
        000031
         */


        // 获取用户输入
        int number = Console.readInt();
        int size = Console.readInt();

        // 求出 number 有几位
        int number2 = number;
        int numberSize = 0;
        while (number2 > 0) {
            numberSize += 1;
            number2 /= 10;
        }

        // if  6 > 31 位数多
        if (size > numberSize) {
            // 补零
            // 打印一些 0
            // 计算 0 的 个数
            int zeroSize = size - numberSize;

            // 打印 zeroSize 个 0
            for (int i = 0; i < zeroSize; i++) {
                Console.print(0);
            }

            // 打印数
            Console.println(number);

        } else { // 不多 : 3127 2

            // 直接打印数
            Console.println(number);
        }





    }
}
