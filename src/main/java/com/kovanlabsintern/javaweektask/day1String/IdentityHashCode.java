package com.kovanlabsintern.javaweektask.day1String;

public class IdentityHashCode {
    public static void ref(String st,String st1)
    {
        if(st==st1)
        {
            System.out.println("true\n"+System.identityHashCode(st)+"=="+System.identityHashCode(st1));
        }
        else
        {
            System.out.println("false\n"+System.identityHashCode(st)+"!="+System.identityHashCode(st1));
        }
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        ref(s1,s2);
        ref(s1,s3);
    }
}
