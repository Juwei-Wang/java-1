package com.zzpublic.assignments.q13;

import com.zzpublic.console.Console;

/**
 * Created by Zhaozhe on 03/10/2016.
 */
public class Question {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print1();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print2();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print3();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print4();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print5();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print6();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print7();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print8();
        i++;

    }

    /*
     *  .   输出效果
     *      * * * * *
     *      * * * *
     *      * * *
     *      * *
     *      *
     */
    public static void print1(){
        int size = 5;
        for (int i = 0; i < size; i++) {
            int width = size - i;
            for (int j = 0; j < width; j++) {
                Console.print("* ");
            }
            Console.println();
        }
    }

    /*
     *  .   输出效果
     *              *
     *            * *
     *          * * *
     *        * * * *
     *      * * * * *
     */
    public static void print2(){
        int size = 5;
        for (int i = 0; i < size; i++) {
            int spaceWidth = size - i - 1;
            for (int j = 0; j < spaceWidth; j++) {
                Console.print("  ");
            }

            int starWidth = i + 1;
            for (int j = 0; j < starWidth; j++) {
                Console.print("* ");
            }
            Console.println();
        }

    }

    /*
     *  .   输出效果
     *          *
     *        * * *
     *      * * * * *
     */
    public static void print3(){
        // 1. 算出来的，写公式
        // 2. 有相同的，写变量
        // 3. 有现有变量的，用现有变量
        int size = 3;
        for (int i = 0; i < size; i++){
            // i 0 1 2
            // _ 2 1 0
            int spaceWidth = size - 1 - i;
            for (int j = 0; j < spaceWidth; j++){
                Console.print("  ");
            }

            // i 0 1 2
            // * 1 3 5
            int starWidth = 2 * i + 1;
            for (int j = 0; j < starWidth; j++){
                Console.print("* ");
            }
            Console.println();
        }
    }

    /*
     *  .   输出效果
     *      * * * * *
     *        * * *
     *          *
     */
    public static void print4(){
        int size = 3;
        for (int i = 0; i < size; i++){
            // i 0 1 2
            // _ 0 1 2
            int spaceWidth = i;
            for (int j = 0; j < spaceWidth; j++){
                Console.print("  ");
            }

            // i 0 1 2
            // * 5 3 1
            int starWidth = 2 * (size - i - 1) + 1;
            for (int j = 0; j < starWidth; j++){
                Console.print("* ");
            }

            Console.println();
        }
    }

    /*
     *  .   输出效果
     *      * * * * *
     *        * * *
     *          *
     *        * * *
     *      * * * * *
     */
    public static void print5(){
        int size = 5;
        for (int y = 0; y < size; y++) {
            int x1 = y;
            int x2 = size - y - 1;
            int left = x1 < x2 ? x1 : x2;
            int right = x1 > x2 ? x1 : x2;

            for (int x = 0; x < size; x++) {
                boolean star = x >= left && x <= right;

                if (star) {
                    Console.print("* ");
                } else {
                    Console.print("  ");
                }
            }
            Console.println();
        }
    }

    /*
     *  .   输出效果
     *      * * * * *
     *      *       *
     *      *       *
     *      *       *
     *      * * * * *
     */
    public static void print6(){
        int size = 5;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                boolean star = x == 0 || x == size - 1 || y == 0 || y == size - 1;

//                boolean star = false;
//                star = star || x == 0;
//                star = star || x == size - 1;
//                star = star || y == 0;
//                star = star || y == size - 1;
                // v = a || b || c;
                // v = false;
                // v = v || a;
                // v = v || b;
                // v = v || c;

                if (star) {
                    Console.print("* ");
                } else {
                    Console.print("  ");
                }
            }
            Console.println();
        }
    }

    /*
     *  .   输出效果
     *      * * * * *
     *        *   *
     *          *
     *        *   *
     *      * * * * *
     */
    public static void print7(){
        int size = 5;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                boolean star = x == y || y == size - 1 - x || y == 0 || y == size - 1;

                if (star) {
                    Console.print("* ");
                } else {
                    Console.print("  ");
                }
            }
            Console.println();
        }
    }

    /*
     *  .   输出效果
     *          * * *
     *          * *
     *          *
     *        * *
     *      * * *
     */
    public static void print8(){

        int size = 5;
        for (int y = 0; y < size; y++) {
            int x1 = size / 2;
            int x2 = size - y - 1;
            int left = x1 < x2 ? x1 : x2;
            int right = x1 > x2 ? x1 : x2;

            for (int x = 0; x < size; x++) {
                boolean star = x >= left && x <= right;

                if (star) {
                    Console.print("* ");
                } else {
                    Console.print("  ");
                }
            }
            Console.println();
        }
    }
}
