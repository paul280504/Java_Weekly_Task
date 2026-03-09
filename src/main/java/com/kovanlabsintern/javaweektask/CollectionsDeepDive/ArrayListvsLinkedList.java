package com.kovanlabsintern.javaweektask.CollectionsDeepDive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListvsLinkedList {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> li = new LinkedList<>();
        int i;
        int len = 1000000;
        for(i = 0; i<=len;i++)
        {
            al.add(i);
            li.add(i);
        }
        long srt1 = System.nanoTime();
        Integer find = al.get(len/2);
        long stp1 = System.nanoTime();
        System.out.println("ArrayList -> Time taken to find "+find+" is "+(stp1-srt1)+" millisecond");
        long srt2 = System.nanoTime();
        Integer find1 = li.get(len/2);
        long stp2 = System.nanoTime();
        System.out.println("LinkedList -> Time taken to find "+find1+" is "+(stp2-srt2)+" millisecond");

    }
}
