package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main31 {
    public static void main(String[] args) {
        int left = 0;
        int right = 0;
        int result = 0;
        for (int i = 0; i < 9; i++) {
            left = i + 1;
            for (int j = 0; j < 9; j++) {
                right = j + 1;
                int outcome = left * right;
                Console.print(left + "*" + right +  "=" + outcome + " ");
            }
            Console.println();

        }
    }
}
