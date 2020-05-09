package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main9 {
    public static void main(String[] args) {
        int x1 = Console.readInt();
        int y1 = Console.readInt();
        int x2 = Console.readInt();
        int y2 = Console.readInt();
        int wide = x1 - x2;
        int height = y1 - y2;
        if (wide < 0){
            wide = 0 - wide;
        }
        if (height < 0){
            height = 0 - height;
        }
        Console.println("Wide = " + wide);
        Console.println("Height = " + height);

    }
}
