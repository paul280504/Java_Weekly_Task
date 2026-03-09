package com.kovanlabsintern.javaweektask.JavaStreamsLambdas;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamStatistics {
    public static void main(String[] args) {
        int min =1;
        int max = 1000;
        Random r = new Random();
        List<Integer> num = new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            num.add(r.nextInt((max-min)+1)+min);
        }
        System.out.print(num);
        IntSummaryStatistics st = num.stream()
//											.mapToInt(Integer::intValue)
//											.summaryStatistics();
                .collect(Collectors.summarizingInt(Integer::intValue));
//	System.out.println("\nMin : "+st.getMin());
//	System.out.println("Max : "+st.getMax());
//	System.out.println("Sum : "+st.getSum());
//	System.out.println("Count : "+st.getCount());
//	System.out.println("Average : "+st.getAverage());
        System.out.print("\n"+st);
    }
}
