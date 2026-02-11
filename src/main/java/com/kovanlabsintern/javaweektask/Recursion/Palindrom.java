package com.kovanlabsintern.javaweektask.Recursion;

import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrom(String s)
    {
        return check(s,0,s.length()-1);
    }
    public static boolean check(String s,int left,int right)
    {
        if(left>=right)
        {
            return true;
        }
        if(s.charAt(left)!=s.charAt(right))
        {
            return false;
        }
        return check(s,left+1,right-1);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a Word: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalindrom(s));
    }
}
