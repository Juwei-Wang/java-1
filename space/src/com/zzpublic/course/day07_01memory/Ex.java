package com.zzpublic.course.day07_01memory;

import com.zzpublic.console.Console;

public class Ex {
    public static void main(String[] args) {

        //  1. 程序执行顺序，要明确到行
        //  2. 内存在任何时刻的样子，
        //  3. 变量声明周期，生死？

        int[] arr = {0, 2, 0, 8};

        for (int i = 0; i < arr.length; i++) {
            boolean nonZeroDigitOccur = false;
            if (arr[i] != 0) {
                Console.print(arr[i]);
                nonZeroDigitOccur = true;
            } else {
                if (nonZeroDigitOccur) {
                    Console.print(arr[i]);
                }
            }
        }


    }
}
