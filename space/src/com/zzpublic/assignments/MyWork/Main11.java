package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main11 {
    public static void main(String[] args) {
        int second = Console.readInt();
        if (second >= 31104000){
            int years = second / 31104000;
            second = second % 31104000;
            Console.println(years + "年");
        }
        if (second >= 2592000){
            int months = second / 2592000;
            second = second % 2592000;
            Console.println(months + "月");
        }
        if (second >= 86400){
            int days = second / 86400;
            second = second % 86400;
            Console.println(days + "天");
        }
        if (second >= 3600){
            int hours = second / 3600;
            second = second % 3600;
            Console.println(hours + "小时");
        }
        if (second >= 60){
            int minutes = second / 60;
            second = second % 60;
            Console.println(minutes + "分钟");
            Console.println(second + "秒");
        }else {
            Console.println(second + "秒");
        }
    }
}
