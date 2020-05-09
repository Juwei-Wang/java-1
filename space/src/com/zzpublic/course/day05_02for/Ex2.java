package com.zzpublic.course.day05_02for;

import com.zzpublic.console.Console;

public class Ex2 {
    public static void main(String[] args) {

        int[] arr = {0, 7, 3, 8, 4, 9, 2, 3, 4};
        for (int i = 0; i < 5; i++) {
            Console.print(arr[i]);
            if (i < 4) {
                Console.print(",");
            }
        }

        // 6, 7, 3, 8, 4

        boolean existZero = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                existZero = true;
                break;
                // ...
            }
        }
        Console.println(existZero);



    }
}
