package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main3 {
    public static void main(String[] args) {
        int price = Console.readInt();
        int shippingFee = 6;
        boolean freeshipping = (price >= 100);
        if (freeshipping) {
            Console.println(price);
            Console.println("总价：" + price + "元");
        }
        Console.println(" 总价："+ (price +6) + "元");
        Console.println("运送费：6 元");
        Console.println("您需支付：" + (price + 6)+ "元");
    }
}
