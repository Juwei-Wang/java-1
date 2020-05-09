package com.zzpublic.course.day06_01while;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {

        //
        int option = Console.readInt();
        ///
        while (option != 0) {
            Console.println("你说啥");
            //
            option = Console.readInt();
            //
        }
        Console.println("好");
        ///
    }
}
