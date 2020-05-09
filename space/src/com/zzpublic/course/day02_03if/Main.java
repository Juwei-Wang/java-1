package com.zzpublic.course.day02_03if;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        {
            int price = 9;
            boolean addRice = false;
            if (addRice) {
                price += 1;
            }
            System.out.println("有人加米饭啦");
            System.out.println(price);
        }
        {
            int total = Console.readInt();
            int shippingFee = 6; // 不要动它

            // 满 100 免 运送费

            if (total < 100) {
                int payment = total + shippingFee;
                Console.println("总价：" + total + " 元");
                Console.println("运送费：" + shippingFee + " 元");
                Console.println("您需支付：" + payment + " 元");

            } else if (total < 200){
                int payment = total;
                Console.println("总价：" + total + " 元");
                Console.println("运送费：" + "免费");
                Console.println("您需支付：" + payment + " 元");

            } else {
                int discount = 40;
                int payment = total - discount;
                Console.println("总价：" + total + " 元");
                Console.println("优惠：" + discount + " 元");
                Console.println("运送费：" + "免费");
                Console.println("您需支付：" + payment + " 元");
            }


//            if (a > 100) {
//
//            } else if (a > 200) {
//
//            }

            // 满 200 减 40


//             a = 3 if b > 10 else 6   // ? :
            // if 3 < a < 6 -> 3 < a && a < 6

            //  打印 结果：

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

        }
        {

            int total = Console.readInt();
            Console.println("总价：" + total + " 元");

            int payment = total;

            // 满 200 减 40
            if (total >= 200) {
                int discount = 40;
                payment = total - discount;
                Console.println("优惠：" + discount + " 元");
            }

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
}
