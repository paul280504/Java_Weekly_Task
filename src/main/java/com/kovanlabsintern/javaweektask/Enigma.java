package com.kovanlabsintern.javaweektask;

import java.util.Scanner;

public class Enigma {
    public static String encrypt(String s1, int key)
    {
        String s2 ="";
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            int res = ch ^ key;
            char ch1 = (char)res;
            s2=s2+ch1;
        }
        return s2;
    }
    public static String decrypt(String s2, int key)
    {
        String s3 ="";
        for(int i=0;i<s2.length();i++)
        {
            char ch = s2.charAt(i);
            int res = ch ^ key;
            char ch1 = (char)res;
            s3=s3+ch1;
        }
        return s3;
    }

    public static void main(String[] args) {
        System.out.println("Enter the message :");
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        System.out.println("Enter the Key :");
        int key = sc.nextInt();
        System.out.println("Encrypted message");
        System.out.println(encrypt(msg, key));
        System.out.println("Decrypted message");
        System.out.println(decrypt(encrypt(msg, key), key));
    }
}
