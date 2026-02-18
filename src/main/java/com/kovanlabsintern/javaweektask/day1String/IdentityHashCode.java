package com.kovanlabsintern.javaweektask.day1String;

public class IdentityHashCode {
    public static String ref(String st,String st1)
    {
        String result = st==st1?"true\n"+System.identityHashCode(st)+"=="+System.identityHashCode(st1):"false\n"+System.identityHashCode(st)+"!="+System.identityHashCode(st1);
        return result;
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(ref(s1,s2));
        System.out.println(ref(s1,s3));
    }
}
