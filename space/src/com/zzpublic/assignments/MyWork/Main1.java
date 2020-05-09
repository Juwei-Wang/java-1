package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main1 {
    public static void main(String[] args) {
        int number = Console.readInt();
        Console.println((number % 10000) / 1000);
        Console.println((number % 1000) / 100);
        Console.println((number % 100) / 10);
        Console.println(number % 10);
    }
}
