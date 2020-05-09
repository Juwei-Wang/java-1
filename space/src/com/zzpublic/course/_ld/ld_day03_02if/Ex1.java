package com.zzpublic.course._ld.ld_day03_02if;

import com.zzpublic.console.Console;

public class Ex1 {
    public static void main(String[] args) {
        //  >   60
        //  <
        //
        //  总价：86 元
        //  运送费：6 元
        //  您需支付：92 元
        //
        //  总价：186 元
        //  运送费：免费
        //  您需支付：186 元
        //
        //  总价：286 元
        //  优惠：40 元
        //  运送费：免费
        //  您需支付：246 元

        int price = Console.readInt();
        boolean freeShipping = price >= 100;
        boolean applyDiscount = price >= 200;


        if (applyDiscount) { // price >= 200
            int discount = 40;
            int totalPrice = price - discount;
            Console.println("总价：" + price + " 元");
            Console.println("优惠：" + discount + " 元");
            Console.println("运送费：免费");
            Console.println("您需支付：" + totalPrice + " 元");

        } else if (freeShipping) { // price >= 100
            int totalPrice = price;
            Console.println("总价：" + price + " 元");
            Console.println("运送费：免费");
            Console.println("您需支付：" + totalPrice + " 元");

        } else { // same ..
            int shippingFee = 6;
            int totalPrice = price + shippingFee;
            Console.println("总价：" + price + " 元");
            Console.println("运送费：" + shippingFee + " 元");
            Console.println("您需支付：" + totalPrice + " 元");
        }


    }
}
