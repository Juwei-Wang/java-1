package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main2 {
    public static void main(String[] args) {
        int Price = Console.readInt();
        int shippingFee = 6;
        boolean Freeshipping = (Price >= 100);
        if (Freeshipping){
            Console.println(Price);
            Console.println("总价：" + Price + "元");
        }

    }
}
