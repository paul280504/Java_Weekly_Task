package com.kovanlabsintern.javaweektask.day2ControlFlowAlgorithmicLogic;

import java.util.Scanner;

public class PrimeSieve {
    public static int[] seieve(int n)
    {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
        {
            prime[i]=true;
        }

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

        int count = 0;
        for(int i=2;i<=n;i++)
        {
            if(prime[i])
            {
                count++;
            }
        }

        int res[] = new int[count];
        int p=0;
        for(int m=2;m<=n;m++)
        {
            if(prime[m])
            {
                res[p]=m;
                p++;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[] = seieve(n);
        for(int val : result)
        {
            System.out.println(val+" ");
        }
    }
}
