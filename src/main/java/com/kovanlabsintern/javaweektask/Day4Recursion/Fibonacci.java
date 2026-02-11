package com.kovanlabsintern.javaweektask.Day4Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n,int[] memo)
    {
        if(n<=1)
        {
            memo[n]=n;
            return n;
        }
        if(memo[n]!=-1)
        {
            return memo[n];
        }
        memo[n]=fib(n-1,memo) + fib(n-2,memo);
        return memo[n];
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n+1];
        Arrays.fill(result,-1);
        fib(n,result);
        for(int num : result)
        {
            System.out.print(num+" ");
        }
    }
}
