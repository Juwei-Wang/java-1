package com.zzpublic.course.day16_01binary;

public class Main {
    public static void main(String[] args) {
        int intValue = Integer.MAX_VALUE;
        //  ---- ---- ---- ---- ---- ---- ---- ----
        //  0111 1111 1111 1111 1111 1111 1111 1111
        //                                        1
        //  1000 0000 0000 0000 0000 0000 0000 0000
        System.out.println(intValue);
        intValue += 1;
        System.out.println(intValue);
        intValue -= 1;
        System.out.println(intValue);
    }
}
