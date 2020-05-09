package com.zzpublic.assignments.q14;

import com.zzpublic.console.Console;

import java.util.function.Consumer;

public class Matrix {
    public static void main(String[] args) {
        {
            Console.printHeader2("printIcons");
            Console.println("BEFORE:");
            int[][] matrix = sourceMatrix();
            printMatrix(matrix);
            Console.println("AFTER:");
            printIcons(matrix);
        }

        question("fill", Matrix::fill);
        question("rollToRight", Matrix::rollToRight);
        question("rollToTop", Matrix::rollToTop);
        question("pushToRight", Matrix::pushToRight);
        question("pushToTop", Matrix::pushToTop);
        question("flipHorizontally", Matrix::flipHorizontally);
        question("flipVertically", Matrix::flipVertically);
        question("rotateRight", Matrix::rotateRight);
        question("rotateLeft", Matrix::rotateLeft);
        question("match", Matrix::match);

    }

    public static void question(String title, Consumer<int[][]> func){
        Console.printHeader2(title);
        Console.println("BEFORE:");
        int[][] matrix = sourceMatrix();
        printMatrix(matrix);
        func.accept(matrix);
        Console.println("AFTER:");
        printMatrix(matrix);
    }


    public static int[][] sourceMatrix(){
        int[][] matrix = {
                {0, 1, 2, 3},
                {1, 0, 0, 3},
                {1, 1, 1, 3},
                {1, 2, 3, 0}
        };
        return matrix;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                Console.print(matrix[y][x] + " ");
            }
            Console.println();
        }
    }

    /*
     *  .   要求
     *      把数据转换为图形字符输出
     *      0 -> .
     *      1 -> X
     *      2 -> @
     *      3 -> #
     *      4 -> O
     *      5 -> %
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      . X @ #
     *      X . . #
     *      X X X #
     *      X @ # .
     */
    public static void printIcons(int[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                int value = matrix[y][x];
                String[] icons = {".", "X", "@", "#", "O", "%"};
                Console.print(icons[value]);
                Console.print(" ");
            }
            Console.println();
        }
    }

    /*
     *  .   要求
     *      把数据里是 0 的地方, 随机补充 1 - 5 的数字
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      1 1 2 3
     *      1 5 4 3
     *      1 1 1 3
     *      1 2 3 2
     */
    public static void fill(int[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if (matrix[y][x] == 0) {
                    matrix[y][x] = (int)(Math.random() * 5) + 1;
                }
            }
        }
    }

    /*
     *  .   要求
     *      向右侧翻滚一格, 最右侧变为最左侧
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      3 0 1 2
     *      3 1 0 0
     *      3 1 1 1
     *      0 1 2 3
     */
    public static void rollToRight(int[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            int temp = matrix[y][matrix.length - 1];
            for (int x = matrix.length - 1; x > 0; x--) {
                matrix[y][x] = matrix[y][x - 1];
            }
            matrix[y][0] = temp;
        }
    }

    /*
     *  .   要求
     *      向上侧翻滚一格, 最上侧变为最下侧
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      0 1 2 3
     */
    public static void rollToTop(int[][] matrix) {
        for (int x = 0; x < matrix.length; x++) {
            int temp = matrix[0][x];
            for (int y = 0; y < matrix.length - 1; y++) {
                matrix[y][x] = matrix[y + 1][x];
            }
            matrix[matrix.length - 1][x] = temp;
        }
    }

    /*
     *  .   要求
     *      把非 0 数据推向右侧
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      0 1 2 3
     *      0 0 1 3
     *      1 1 1 3
     *      0 1 2 3
     */
    public static void pushToRight(int[][] matrix) {

    }

    /*
     *  .   要求
     *      把非 0 数据推向上侧
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      1 1 2 3
     *      1 1 1 3
     *      1 2 3 3
     *      0 0 0 0
     */
    public static void pushToTop(int[][] matrix) {

    }

    /*
     *  .   要求
     *      把数据横向翻转
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      3 2 1 0
     *      3 0 0 1
     *      3 1 1 1
     *      0 3 2 1
     */
    public static void flipHorizontally(int[][] matrix) {

    }

    /*
     *  .   要求
     *      把数据纵向翻转
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      1 2 3 0
     *      1 1 1 3
     *      1 0 0 3
     *      0 1 2 3
     */
    public static void flipVertically(int[][] matrix) {

    }

    /*
     *  .   要求
     *      把数据向右旋转
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      1 1 1 0
     *      2 1 0 1
     *      3 1 0 2
     *      0 3 3 3
     */
    public static void rotateRight(int[][] matrix) {
        //  flip 1
        //  flip hori
        //  flip 对角线
    }

    /*
     *  .   要求
     *      把数据向左旋转
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      3 3 3 0
     *      2 0 1 3
     *      1 0 1 2
     *      0 1 1 1
     */
    public static void rotateLeft(int[][] matrix) {

    }

    /*
     *  .   要求
     *      消除任意横向或纵向有连续三个相同的非0数据
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      0 1 2 0
     *      0 0 0 0
     *      0 0 0 0
     *      0 2 3 0
     */
    public static void match(int[][] matrix) {
        // 一个方向消除 就算对

    }
}
