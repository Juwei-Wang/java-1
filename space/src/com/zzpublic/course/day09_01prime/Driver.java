package com.zzpublic.course.day09_01prime;

import com.zzpublic.console.Console;

public class Driver {
    public static void main(String[] args) {
        //  打印 1 - 100 以内 所有的质数

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            //  检测一个数 i, 是否是质数

            //  只能被 1 和 这个数本身 整除的数，

            //  只有这两个是 true，其它整除都是 false


            //  if() 用来检查 能被 1 和 自己整除
            //  但是 无法断定，和 其它数的整除关系

            //  任何数都能被 1 和 自己整除

            //  这个数除 除了1和自己 其它所有的数 都不能整除        不能被 1 - self 整除 -> 质数

            //  loop j = [2 -> self)

            for (int j = 2; j < i; j++) {
                //  判断有没有余数，
                //  如果有？-> 说明没有被整除，就ok，继续循环
                //  如果没有？-> 说明被整除了，就break
                //      因为一旦被一个数整除，
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            //  i = 8

            //  j = 2           isPrime = false;
            //  j = 4           isPrime = false;


            //      

            //  ------

            //  如果不是质数，就一定能被 2 3 5 7 吗，某一个数 整除， 不是质数 -> 能被 2 3 5 7

            //  那我们写 if 语句          47

            //  A -> B          所有计算机专业的人 都在 加拿大

            //  B -> A          所有在加拿大的人 都是 计算机专业

            //  !A -> !B        所有不是计算机的人 都在 不在加拿大

            //  !B -> !A        所有 不在 加拿大的人 都 不是 计算机专业的

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
