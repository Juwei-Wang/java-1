package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main29 {
    public static void main(String[] args) {
        int lenArray = 6;//数组的元素个数
        int[] Array = new int[lenArray];//定义数组
        for (int i = 0; i < Array.length; i++) {//循环
            System.out.print("请输入第" + (i + 1) + "个整数:");
            Array[i] = Console.readInt();
        }
        int value = 0;
        for (int i = 0; i < Array.length; i++){
            if (Array[i] > value){
                value = Array[i];
            }
        }
        Console.println("最大的数字是");
        Console.println(value);

    }

}
