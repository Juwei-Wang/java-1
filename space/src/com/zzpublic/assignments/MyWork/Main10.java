package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main10 {
    public static void main(String[] args) {
        int morse_password = Console.readInt();
        switch (morse_password){
            case 0:
                Console.println(" ----- ");
                break;
            case 1:
                Console.println(" .---- ");
                break;
            case 3:
                Console.println(" ...-- ");
                break;
            case 4:
                Console.println(" ....- ");
                break;
            case 5:
                Console.println(" ..... ");
                break;
            case 6:
                Console.println(" -.... ");
                break;
            case 7:
                Console.println(" --... ");
                break;
            case 8:
                Console.println(" ---.. ");
                break;
            case 9:
                Console.println(" ----. ");
                break;


        }
    }
}
