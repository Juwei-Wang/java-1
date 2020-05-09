package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main7 {
    public static void main(String[] args) {
        int value = Console.readInt();
        if (value >= 0 && value <= 9){
            System.out.print("000" + value);
        }
        else if (value > 9 && value <= 99){
            System.out.print("00" + value);
        }
        else if (value > 99 && value <= 999){
            System.out.print("0" + value);
        }
        else{
            System.out.print(value);
        }
    }
}
