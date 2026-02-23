package com.kovanlabsintern.javaweektask.ClassesStaticsTheSingletonPattern;

public class Singleton {
    public static void main(String[] args)
    {
        AppConfig A = AppConfig.getInstance();
        AppConfig B = AppConfig.getInstance();
        if(A==B)
        {
            System.out.println("A -> "+System.identityHashCode(A));
            System.out.print("B -> "+System.identityHashCode(B));
        }
        else {
            System.out.println("A & B have different Hashcode");
        }

    }
}
