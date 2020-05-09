package com.zzpublic.course.day13_03var;

import com.zzpublic.console.Console;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        {
            int a = 0;
            changeVar(a);
            Console.println(a);
        }
        {
            int[] a = {3};
            changeArr(a);
            Console.println(a[0]);
        }
        {
            int[] a = {3};
            changeContentOfArr(a);
            Console.println(a[0]);
        }
    }

    public void changeVar(int v) {
        v = 1;
    }

    public void changeArr(int[] arr) {
        arr = new int[]{4};
    }

    public void changeContentOfArr(int[] arr){
        arr[0] = 4;
    }
}
