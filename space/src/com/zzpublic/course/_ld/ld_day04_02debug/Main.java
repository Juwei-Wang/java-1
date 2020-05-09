package com.zzpublic.course._ld.ld_day04_02debug;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        int total = Console.readInt();
        Console.println("总价：" + total + " 元");

        int payment = total;

        // 满 200 减 40
        if (total >= 200) {
            Console.println("check point 1");
            int discount = 40;
            Console.println("payment before: " + payment);
            payment -= discount;
            Console.println("payment after : " + payment);
            Console.println("优惠：" + discount + " 元");
        }

        // 满 100 免 运送费
        if (total >= 100) {
            Console.println("运送费：" + "免费");
        } else {
            int shippingFee = 6;
            payment += shippingFee;
            Console.println("运送费：" + shippingFee + " 元");
        }

        // 显示支付
        Console.println("您需支付：" + payment + " 元");
    }
}
