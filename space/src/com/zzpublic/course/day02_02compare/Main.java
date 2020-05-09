package com.zzpublic.course.day02_02compare;

public class Main {
    public static void main(String[] args) {
        {
            // >  <  !=
            // >= <= ==
            System.out.println(3 != 5);

            // == 比较相等
            // = 赋值

            boolean result = 3 > 5;
            result = true;
            result = false;

            int a = 2;
            System.out.println(1 + a + 3); // 表达式求值
//        System.out.println(1 < a < 3); // 打错特错！
//        System.out.println(1 < 2 < 3);
//        System.out.println(true < 3);

            System.out.println(1 < a && a < 3);
//        System.out.println(1 < a && a < 3);
//        System.out.println(1 < 2 && a < 3);
//        System.out.println(true && a < 3);
//        System.out.println(true && 2 < 3);
//        System.out.println(true && true);
//        System.out.println(true);
        }
        {
            boolean a = true, b = true, c = true, d = false;

//            boolean v1 = a && b && c && d;
            boolean v2 = a && b && c && (d = true);

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);

        }

    }
}
