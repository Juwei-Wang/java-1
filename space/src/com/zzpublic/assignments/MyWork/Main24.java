package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main24 {
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
        String star = " * ";
        for (int i = 0; i < 5 ; i++) {
            int k = 5 - i;
            String Acumulate = " ";
            for (int j = 0; j < k; j++) {
                Acumulate = Acumulate + star;
            }
            Console.println(Acumulate);

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
        String star = "*";
        String Printstars = " ";
        for (int i = 0; i < 5 ; i++) {
            int storeValue = 4 - i;
            Printstars = " ";
            for (int j = 0; j < storeValue; j++) {
                Printstars = Printstars + " ";

            }
            int storeValue1 = i + 1;
            for (int k = 0; k < storeValue1 ; k++) {
                Printstars = Printstars + star;

            }

            Console.println(Printstars);
        }


    }

    /*
     *  .   输出效果
     *          *
     *        * * *
     *      * * * * *
     */
    public static void print3(){
        for (int i = 0; i < 3; i++) {
            int value = 2 - i;
            for (int j = 0; j < value; j++) {
                Console.print("  ");

            }
            int value1 = (2 * i) + 1;
            for (int j = 0; j < value1; j++) {
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
        for (int i = 0; i < 3; i++) {
            int value = i;
            for (int j = 0; j < value; j++) {
                Console.print("  ");

            }
            int value1 = 5 - (2 * i);
            for (int j = 0; j < (5 - 2*i); j++) {
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
        for (int i = 0; i < 3; i++) {
            int value = i;
            for (int j = 0; j < value; j++) {
                Console.print("  ");

            }
            int value1 = 5 - 2 * i;
            for (int j = 0; j < value1; j++) {
                Console.print("* ");
            }
            Console.println();
        }

        for (int i = 0; i < 2; i++) {
            int value2 = 1 - i;
            for (int j = 0; j < value2; j++) {
                Console.print("  ");

            }
            int value3 = 2 * i + 3;
            for (int j = 0; j < value3; j++) {
                Console.print("* ");
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
        for (int i = 0; i < 5 ; i++) {
            Console.print(" * ");
        }
        Console.println();
        for (int i = 0; i < 3; i++) {
            Console.print(" * ");
            for (int j = 0; j < 9; j++) {
                Console.print(" ");
            }
            Console.print(" * ");
            Console.println();

        }
        for (int i = 0; i < 5 ; i++) {
            Console.print(" * ");
        }
        Console.println();



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
        for (int i = 0; i < 5 ; i++) {
            Console.print(" * ");
        }
        Console.println();
        for (int i = 0; i < 3 ; i++) {
            Console.print("  ");
            if (i == 0 || i == 2){
                Console.print("  * ");
                Console.print("   ");
                Console.print(" * ");
                Console.print("  ");
            }
            else {
                for (int j = 0; j < 5; j++) {
                    Console.print(" ");
                    if (j ==  2){
                        Console.print("  * ");

                    }

                }

            }
            Console.println();

        }
        for (int i = 0; i < 5 ; i++) {
            Console.print(" * ");
        }
        Console.println();


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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                Console.print("  ");
            }
            int value1 = 3 - i;
            for (int j = 0; j < value1; j++) {
                Console.print("* ");

            }
            Console.println();
        }

        for (int i = 0; i < 2; i++) {
            int value2 = 1 - i;
            for (int j = 0; j < value2; j++) {
                Console.print("  ");
            }
            int value3 = 2 + i;
            for (int j = 0; j < value3; j++) {
                Console.print("* ");
            }
            Console.println();
        }

    }
}
