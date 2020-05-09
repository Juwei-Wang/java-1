package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main21 {
    public static void main(String[] args) {
        int Number = Console.readInt();
        String stringNumber = String.valueOf(Number);
        String[] arrayNumber = stringNumber.split("");
        for (int i = 0; i < arrayNumber.length; i++){
            Console.println(arrayNumber[i]);

        }
    }
}
