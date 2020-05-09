package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main6 {
    public static void main(String[] args) {
        int price = Console.readInt();
        int shippingFee = 6;
        boolean freeShipping = (price >= 100);
        if (freeShipping) {
            Console.println("总价：" + price);
            Console.println("运送费：免费");
            Console.println("您需支付：" + price + "元" );

        }
        if (!freeShipping) {
            Console.println(" 总价：" + (price + 6) + "元");
            Console.println("运送费：6 元");
            Console.println("您需支付：" + (price + 6) + "元");
        }
        if (price >= 200) {
            Console.println(" 总价：" + price + "元");
            Console.println("优惠：40 元");
            Console.println("运送费： 免费");
            Console.println("您需支付：" + (price - 40) + "元");
        }
    }
}


