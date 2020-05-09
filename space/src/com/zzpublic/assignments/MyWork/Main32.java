package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main32 {
    public static void main(String[] args) {
        new Main32().run();
    }

    public void run(){
        int value1 = Console.readInt();
        int value2 = Console.readInt();
        int max = f(value1, value2);
        Console.println();


    }

    public int f(int value1, int value2){
        int c = 0;
        if (value1 >= value2) {
            c = value1;
        } else{
            c = value2;
        }
        return c;
    }

    public int abs(int number){
        int absNumber = 0;
        if (number >= 0){
            absNumber = number;
        } else {
            absNumber = number * (-1);
        }
        return  absNumber;


    }


    public double g(double array[]){
        double total = 0;
        double average = 0;
        for (int i = 0; i < array.length ; i++) {
            total += array[i];

        }
        average = total / array.length;
        return average;
    }




}
