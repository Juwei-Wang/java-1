package com.zzpublic.course.day10_02func;

import com.zzpublic.console.Console;

public class Ex {
    public static void main(String[] args) {
        new Ex().run();
    }

    // int a = 3;
    // a -> 「3」
    // a 变量
    // 3 值
    // 函数   星球
    // 变量   宇航服
    // 值     人

    public void run() {
        int a = 6;
        int result = min(3, a);
        Console.println(result);

        int value = Console.readInt();
        Console.println(abs(value));

        double[] values = {3.0, 1.2, 5.8};
        Console.println(avg(values));
    }

    public int min(int v1, int v2) {    // min(int, int)
        int minimum = v1 < v2 ? v1 : v2;
        return minimum;
    }

    public int min() {                  // min()
        return 0;
    }

    public int abs(int v1) {
        return v1 > 0 ? v1 : -v1;
    }

    public double avg(double[] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }

    // min(v1: int, v2: int) -> int

    // abs(v1: int) -> int

    // 假设这个数组里 一定至少有一个元素
    // avg(values: double[]) -> double


}



