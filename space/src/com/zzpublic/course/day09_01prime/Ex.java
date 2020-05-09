package com.zzpublic.course.day09_01prime;

import com.zzpublic.console.Console;

public class Ex {
    public static void main(String[] args) {

//        arr -> 1, 3, 2, 7, 0, 0, 0

        //  找 0 就把它放到最后面，
        //  找有几个 0。3

        //  1 0 3 2 0 0 7
        //    ^
        //  a[i] = a[i + 1]
        //  1 3 3 2 0 0 7

        //  每个数，跟前面的数 检测 如果当前的数 不是0， 前面的数 是0，就互换
        //  如果发生 互换，就 重新检测
        //  1 0 3 2 0 0 7
        //    ^
        //  1 0 3 2 0 0 7
        //      ^
        //  1 3 0 2 0 0 7
        //        ^
        //  1 3 2 0 0 0 7
        //          ^

        //  1 0 3 2 0 0 7
        //  1 3 0 2 0 0 7
        //  1 3 2 0 0 0 7
        //  1 3 2 0 0 0 7
        //              ^
        //  1 3 2 0 0 7 0
        //  1 3 2 0 7 0 0
        //  1 3 2 7 0 0 0
        //
        //  每个数，跟前面的数 检测 如果当前的数 不是0， 前面的数 是0，就互换
        //  如果发生 互换，就 重新 {检测} repeat

        int[] arr = {1, 0, 3, 2, 0, 0, 7};

        boolean exchanged = true;
        while (exchanged) {
            //  检测
            //  每个数，跟前面的数 检测 如果当前的数 不是0， 前面的数 是0，就互换
            exchanged = false;
            for (int i = 1; i < arr.length; i++) {
                // 1 0 3 2 0 0 7
                // 0 1 2 3 4 5 6
                //   ^
                //  这个数是不是 0
                //  前面的数是不是 0
                //  如果当前的数 不是0， 前面的数 是0，就互换

                if (arr[i] != 0 && arr[i - 1] == 0) {
                    // 互换

                    // int a;
                    // int b;

                    // a = b
                    // b = a;

                    // int temp = a;
                    // a = b;
                    // b = temp;

                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;

                    exchanged = true;
                    break;

                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            Console.println(arr[i]);
        }
        // loop {


        // }




        /*
        for (...) {
            if (xxx) {
                yyy = true;
                break;
            }
        } else {
            yyy = false;
        }
         */


    }
}
