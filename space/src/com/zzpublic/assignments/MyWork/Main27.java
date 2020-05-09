package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main27 {
    public static void main(String[] args) {
        new Main27().run();
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

}
