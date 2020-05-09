package com.zzpublic.course.day08_01nested;

import com.zzpublic.console.Console;

public class Ex2 {
    public static void main(String[] args) {
        //  1 x 1 = 1
        //  1 x 2 = 2, 2 x 2 = 4
        //  1 x 3 = 3, 2 x 3 = 6, 3 x 3 = 9
        //  1 x 4 = 4, 2 x 4 = 8, 3 x 4 = 12, 4 x 4 = 16
        //
        //  ..

        for (int i = 0; i < 4; i++) {
            int right = i + 1;
            for (int j = 0; j < right; j++) {
                int left = j + 1;
                int result = left * right;
                Console.print(left + " x " + right + " = " + result);
                if (j != 3) {
                    Console.print(", ");
                }
            }
            Console.println();
        }

    }
}
