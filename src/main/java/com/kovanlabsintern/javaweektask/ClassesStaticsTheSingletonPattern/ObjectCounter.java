package com.kovanlabsintern.javaweektask.ClassesStaticsTheSingletonPattern;

public class ObjectCounter {
    private static int count = 0;
    ObjectCounter()
    {
        count++;
    }
    public static int getcount()
    {
        return count;
    }
    public static void main(String[] args)
    {
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();
        System.out.println(ObjectCounter.getcount());
    }
}
