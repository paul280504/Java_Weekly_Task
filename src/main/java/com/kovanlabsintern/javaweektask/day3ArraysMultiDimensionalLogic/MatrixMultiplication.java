package com.kovanlabsintern.javaweektask.day3ArraysMultiDimensionalLogic;

import java.util.Arrays;
import java.util.Objects;

public class MatrixMultiplication {
    public static int[][] multiply(int[][] m,int[][] n) {
        int[][] p;
        if (m[0].length != n.length) {
            return null;
        } else {
            p = new int[m.length][n[0].length];
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < n[0].length; j++) {
                    for (int k = 0; k < n.length; k++) {
                        p[i][j] += m[i][k] * n[k][j];
                    }
                }
            }
        }
        return p;
    }
    public static void main(String[] args)
    {
        int[][] A = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] B = new int[3][3];
        System.arraycopy(A,0,B,0,3);
        int[][] arr = multiply(A,B);
        for(int[] res : arr)
        {
            System.out.println(Arrays.toString(res));
        }
    }

}
