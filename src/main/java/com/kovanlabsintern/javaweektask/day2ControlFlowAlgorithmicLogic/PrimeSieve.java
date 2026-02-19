package com.kovanlabsintern.javaweektask.day2ControlFlowAlgorithmicLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeSieve {
    public static List<Integer> seieve(int n)
    {
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime,true);
        for(int j=2;j*j<=n;j++)
        {
            if(prime[j])
            {
                for(int k=j*j;k<=n;k+=j)
                {
                    prime[k]=false;
                }
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int i=2;i<=n;i++)
        {
            if(prime[i])
            {
                l.add(i);
            }
        }
        return l;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = seieve(n);
        System.out.println("Prime Number Till "+n+" are :");
        for(int val : result)
        {
            System.out.print(val+" ");
        }
    }
}
