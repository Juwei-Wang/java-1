package com.zzpublic.assignments.MyWork;

public class Main25 {
    /*
     *  .   要求
     *      把非 0 数据推向右侧
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
    public void pushToRight(int[][] matrix) {
        boolean change1 = true;

        while (change1 == true) {

            change1 = false;

            for (int i = 0; i < 4; i++) {

                for (int j = 0; j < 4; j++) {

                    boolean change = false;

                    if (j >= 1) {

                        if (matrix[i][j] == 0 && matrix[i][j - 1] != 0) {
                            change = true;

                        }

                        if (change = true) {

                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[i][j - 1];
                            matrix[i][j - 1] = temp;
                        }

                    }

                }

            }
            for (int i = 0; i < 4; i++) {


                for (int j = 0; j < 4; j++) {

                    if (j >= 1) {

                        if (matrix[i][j] == 0 && matrix[i][j - 1] != 0) {
                            change1 = true;
                        }
                    }

                }

            }
        }
    }
}
