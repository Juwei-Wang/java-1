package com.zzpublic.course.day02_04debug;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        int total = Console.readInt();
        Console.println("总价：" + total + " 元");

        int payment = total;

        Console.println("payment before: " + payment);
        // 满 200 减 40
        if (total >= 200) {
            Console.println("------- 1");
            int discount = 40;
            payment = total - discount;
            Console.println("优惠：" + discount + " 元");
        }
        Console.println("payment after: " + payment);

        // 满 100 免 运送费
        if (total >= 100) {
            Console.println("运送费：" + "免费");
        } else {
            int shippingFee = 6; // 不要动它
            payment = total + shippingFee;
            Console.println("运送费：" + shippingFee + " 元");
        }

        // 显示支付
        Console.println("您需支付：" + payment + " 元");

    }
}
