package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main17 {
    public static void main(String[] args) {
        boolean test = false;
        int[] arr = {6, 7, 0, 0, 0};
        for (int i = 0; i < 5; i++) {
            if (arr[i] == 0) {
                test = true;
                Console.println(test);
                if (arr[i] == 0){
                    break;
                }
            }
        }
    }
}
