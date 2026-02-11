package com.kovanlabsintern.javaweektask.day3ArraysMultiDimensionalLogic;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralTraversal {
    public static int[][] spiral(int n)
    {
            int[][] mat = new int[n][n];
            int i=0;
            int top=0;
            int left=0;
            int right=mat[0].length-1;
            int bottom=mat[0].length-1;

            while(top<=bottom && left<=right)
            {
                for(int col=left;col<=right;col++)
                {
                    mat[top][col]=i;
                    i++;
                }top++;

                for(int row=top;row<=bottom;row++)
                {
                    mat[row][right]=i;
                    i++;
                }right--;

                for(int col=right;col>=left;col--)
                {
                    mat[bottom][col]=i;
                    i++;
                }bottom--;

                for(int row=bottom;row>=top;row--)
                {
                    mat[row][left]=i;
                    i++;
                }left++;
            }
            return mat;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int[][] x=spiral(y);
        for(int[] row : x)
        {
            System.out.println(Arrays.toString(row));
        }
        sc.close();
    }
}
