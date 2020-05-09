package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main20 {
    public static void main(String[] args) {
        Console.printHeader2("Menu");
        Console.println("查询余额请按1");
        Console.println("退出轻按0");
        int choices = Console.readInt();
        while (choices == 1){
            Console.println("您的余额是0");
            Console.printHeader2("Menu");
            Console.println("查询余额请按1");
            Console.println("退出轻按0");
            choices = Console.readInt();
        }
        Console.println("好");
    }
}
