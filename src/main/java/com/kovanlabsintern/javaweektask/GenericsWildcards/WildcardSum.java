package com.kovanlabsintern.javaweektask.GenericsWildcards;

import java.util.List;

public class WildcardSum {

    public static double sumList(List<? extends Number> list) {
        double sum = 0.0;

        for (Number num : list) {
            sum +=num.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> li1 = List.of(5, 4, 3, 2);
        List<Double> li2 = List.of(1.5, 2.5, 3.5);

        System.out.println("Total Sum of List :"+sumList(li1));
        System.out.println("Total Sum of List :"+sumList(li2));
    }
}
