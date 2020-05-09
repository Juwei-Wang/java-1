package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main8 {
    public static void main(String[] args) {
        int a = Console.readInt();
        int b = Console.readInt();
        int c = Console.readInt();
        if (a >= b && a >= c){
            System.out.println(a);
        }
        else if (b >= c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
