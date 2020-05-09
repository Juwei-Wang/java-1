package com.zzpublic.course._ld.ld_day03_01compare;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        {
            // >  <  !=
            // >= <= ==

            // 3 + 5 -> 8
            // 3 > 5 -> false
            // 6 < 8 -> true

            Console.println(3 > 5);

            boolean result = 3 > 5;

            Console.println(3 != 4);
            Console.println(3 == 4);



        }
        {
            int a = 4;
//            Console.println(3 < a < 5);       // python 3 < a < 5
//            Console.println(3 < 4 < 5);
//            Console.println(true < 5);
        }
        {
            int a = 4;
            Console.println(true && true);
            Console.println(3 < a && a < 5);
//            Console.println(3 < 4 && a < 5);
//            Console.println(true && a < 5);
//            Console.println(true && 4 < 5);
//            Console.println(true && true);
//            Console.println(true);

            // < > -> * /
            // && || -> + -
        }
        {
            // assign
            int a = 3;
            int b = a = 4;
            // 任何一个运算符，在运算之后都会有产出值
            // int b = a = 4;
            // int b = 4;

            // 赋值运算符 额外，会将 等号右边的赋值给等号左边
            b = 7;

            // = 运算符 如果出现 相同的运算符在一起，从右向左运算
            // 8 - 2 - 0;
            // b = a = 9;
            // b = 9;
            // 9;
        }
        {
            //
            boolean a, b, c, d;
            a = true;
            b = true;
            c = false;
            d = false;

//            boolean v1 = a && b && c && d;
//            Console.println(v1);
//            Console.println(d);
            boolean v2 = a && b && c && (d = true);
            Console.println(v2);
            Console.println(d);
        }
    }
}
