package com.zzpublic.course._ld.ld_day03_02if;

import com.zzpublic.console.Console;

public class Ex3 {
    public static void main(String[] args) {
        int total = Console.readInt();
        Console.println("总价：" + total + " 元");

        int payment = total;

        // 满 200 减 40
        if (total >= 200) {
            int discount = 40;
            payment -= discount;
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
