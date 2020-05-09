package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main26 {
///     *  .   要求
///     *      向上侧翻滚一格, 最上侧变为最下侧
///     *
///             *  .   效果
///     *      matrix
///     *      0 1 2 3
///             *      1 0 0 3
///             *      1 1 1 3
///     *      1 2 3 0
///
 //            *      <<
 //            *      1 0 0 3
 ///            *      1 1 1 3
///             *      1 2 3 0
///             *      0 1 2 3
///             *

    public void rollToTop(int[][] matrix) {
        int[][] matrixInt = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        for (int i = 0; i < 4 ; i++) {
            if (i < 3){
                for (int j = 0; j < 4; j++) {
                    matrixInt[i][j] = matrix[i + 1][j];
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            matrixInt[3][i] = matrix[0][i];
        }
        Console.println(matrixInt);

    }

}
