package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main33 {
    public static void main(String[] args) {
        new Main33().run();
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
            Console.println(result);
        }

        {
            // ex 3
            Console.printHeader2("ex 2");
            int[] arr = mockArray();
            int result = sum(arr);
            Console.println(result);
        }

        {
            // ex 4
            Console.printHeader2("ex 4");
            int[] arr = mockArray();
            int value = 3;
            int result = countSameValue(arr,value);
            Console.println(result);

        }

        {
            // ex 5
            Console.printHeader2("ex 5");
            int size = 6;
            int[] array = creatArray(size);
            print(array);

        }

        {
            // ex 6
            Console.printHeader2("ex 6");
            int number = 3;
            int[] arr = mockArray();
            int result = checkTheIndex(mockArray(),number);
            Console.println(result);

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
            Console.printHeader2("ex 8");
            int[][] arr = mockDataFrame();
            int result = checkMaxNumber(arr);
            Console.println(result);

        }

        {
            // ex 9
            Console.printHeader2("ex 9");
            int[][] arr = mockDataFrame();
            int result = sum2dArray(arr);
            Console.println(result);

        }

        {
            // ex 10
            Console.printHeader2("ex 10");
            int height = 2;
            int width = 2;
            int[][] arr = creat2DArray(height,width);
            print(arr);
        }

        {
            // ex 11
            Console.printHeader2("ex 11");
            int index = 1;
            int[][] arr = mockDataFrame();
            int[] indexArray = creatIndexArray(arr,index);
            print(indexArray);

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
    public int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    //  ex 4
    //  count(arr: int[], value: int) -> int
    //  返回 arr 数组里有多少的元素的值跟 value 一样
    public  int countSameValue(int arr[], int value){
        int countNumber = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == value){
                countNumber += 1;

            }
        }
        return countNumber;
    }

    //  ex 5
    //  zeros(size: int) -> int[]
    //  生成一个 尺寸是 size 的数组，并且数组里的所有的元素都是 0
    public int[] creatArray(int size){
        int[] array = new int[size];
        return array;
    }

    //  ex 6
    //  indexOf(arr: int[], value: int) -> int
    //  检查 arr 数组里 第一次出现 value 的 索引值
    //  如果 arr 数组里 没有这个 value，则 返回 -1
    public int checkTheIndex(int[] arr,int number){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                if (index == -2 || index == -1) {
                    index = i;
                }
            }
        }
        return index;
    }


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
    public int checkMaxNumber(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] >= max){
                    max = arr[i][j];
                }
            }

        }
        return max;
    }

    //  ex 9
    //  sum(data: int[][]) -> int
    //  返回 data 数组里所有元素的和
    public int sum2dArray(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                sum += arr[i][j];

            }
        }
        return sum;
    }


    //  ex 10
    //  zeros(width: int, height: int) -> int[][]
    //  生成一个 宽度是 width 高度是 height 的数组
    public int[][] creat2DArray(int size,int size1){
        int[][] array = new int[size][size1];
        return array;
    }

    //  ex 11
    //  row(data: int[][], index: int) -> int[]
    //  生成一个新的数组，尺寸是 data 这个二维数组的宽度
    //  这个心的数组里的所有的值 是 分别对应 data 二维数组里 第 index 行的值
    public int[] creatIndexArray(int[][] arr,int number){
        int[] indexArray = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (number == j){
                    indexArray[i] = arr[i][j];
                }

            }

        }
        return indexArray;
    }

    //  ex star 2
    //  col(data: int[][], index: int) -> int[]
    //  生成一个新的数组，尺寸是 data 这个二维数组的宽度
    //  这个心的数组里的所有的值 是 分别对应 data 二维数组里 第 index 行的值
    public int[] creatIndexArray1(int[][] arr,int number){
        int[] indexArray = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (number == i){
                    indexArray[i] = arr[i][j];
                }

            }
        }
        return indexArray;
    }

}
