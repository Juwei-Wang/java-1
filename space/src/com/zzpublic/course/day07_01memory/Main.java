package com.zzpublic.course.day07_01memory;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {

        int number = Console.readInt();

        int[] units = new int[3];

        for(int i = 0; i < 3; i ++) {
            units[i] = number % 10;
            number = number / 10;
        }

        for(int i = 0; i < 3; i ++) {
            Console.println(units[2 - i]);
        }
    }
}
