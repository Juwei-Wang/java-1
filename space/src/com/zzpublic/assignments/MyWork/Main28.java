package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main28 {
    public static void main(String[] args) {
        new Main28().run();
    }

    public void run(){
        int a = Console.readInt();
        int b = Console.readInt();
        int max = f(a, b);


    }

    public int f(int a, int b){
        int c = 0;
        if (a >= b) {
            c = a;
        }
        if (b >= a) {
            c = b;
        }
        return c;
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
