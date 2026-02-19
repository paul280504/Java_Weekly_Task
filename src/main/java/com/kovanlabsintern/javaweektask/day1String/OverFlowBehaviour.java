package com.kovanlabsintern.javaweektask.day1String;

public class OverFlowBehaviour {
    public static void main(String[] args) {
        System.out.println("Byte - OverFlowBehaviour");
        for(byte i = 0;i<Byte.MAX_VALUE;i++)
        {
            System.out.println(i);
        }
        byte j = Byte.MAX_VALUE;
        System.out.println(j);
        j++;
        System.out.println("Overflow"+j);
    }
}
