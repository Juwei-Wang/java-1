package com.zzpublic.assignments.q15;

import com.zzpublic.console.Console;

import java.util.function.Consumer;

public class DataFrame {
    public static void main(String[] args) {
        new DataFrame().run();
    }

    public void run() {
        {
            // 测试你写的方法时，建议使用这种大括号对
            // 可以用来隔离变量的作用域

            // ex 1
            // print
            Console.printHeader2("ex 1");
            int[] arr = mockArray();
            print(arr);
        }
        {
            // ex 2
            // max
            Console.printHeader2("ex 2");
            int[] arr = mockArray();
            int result = max(arr);
            Console.print(result);
        }
        {
            // ex 3
        }
        {
            // ex 4
        }
        {
            // ex 5
        }
        {
            // ex 6
        }
        {
            // ex 7
            // print
            Console.printHeader2("ex 7");
            int[][] data = mockDataFrame();
            print(data);
        }
        {
            // ex 8
        }
        {
            // ex 9
        }
        {
            // ex 10
        }
        {
            // ex 11
        }
    }


    public int[] mockArray() {
        return new int[]{6, 7, 3, 3, 4};
    }

    //  ex 1
    //  print(data: int[])
    //  打印 一维数组
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Console.print(arr[i]);
            Console.print(" ");
            Console.println();
        }
    }

    //  ex 2
    //  max(arr: int[]) -> int
    //  返回整个数组里最大的那个数
    public int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //  ex 3
    //  sum(arr: int[]) -> int
    //  返回 arr 数组的所有元素的和

    //  ex 4
    //  count(arr: int[], value: int) -> int
    //  返回 arr 数组里有多少的元素的值跟 value 一样

    //  ex 5
    //  zeros(size: int) -> int[]
    //  生成一个 尺寸是 size 的数组，并且数组里的所有的元素都是 0

    //  ex 6
    //  indexOf(arr: int[], value: int) -> int
    //  检查 arr 数组里 第一次出现 value 的 索引值
    //  如果 arr 数组里 没有这个 value，则 返回 -1


    //  ex star 1
    //  merge(arr1: int[], arr2: int[]) -> int[]
    //  返回一个新的数组，是 arr1 和 arr2 的合并


    public int[][] mockDataFrame() {
        return new int[][]{
                {1, 2},
                {2, 3}
        };
    }

    //  ex 7
    //  print(data: int[][])
    //  打印 二维数组
    public void print(int[][] data) {
        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[y].length; x++) {
                Console.print(data[y][x]);
                Console.print(" ");
            }
            Console.println();
        }
    }

    //  ex 8
    //  max(data: int[][]) -> int
    //  返回 data 二维数组里最大的那个数

    //  ex 9
    //  sum(data: int[][]) -> int
    //  返回 data 数组里所有元素的和

    //  ex 10
    //  zeros(width: int, height: int) -> int[][]
    //  生成一个 宽度是 width 高度是 height 的数组

    //  ex 11
    //  row(data: int[][], index: int) -> int[]
    //  生成一个新的数组，尺寸是 data 这个二维数组的宽度
    //  这个心的数组里的所有的值 是 分别对应 data 二维数组里 第 index 行的值

    //  ex star 2
    //  col(data: int[][], index: int) -> int[]
    //  生成一个新的数组，尺寸是 data 这个二维数组的宽度
    //  这个心的数组里的所有的值 是 分别对应 data 二维数组里 第 index 行的值
}
