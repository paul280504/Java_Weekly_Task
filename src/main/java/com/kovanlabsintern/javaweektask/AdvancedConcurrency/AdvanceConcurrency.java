package com.kovanlabsintern.javaweektask.AdvancedConcurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AdvanceConcurrency {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Integer>> future = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            int number =i+1;
            Callable<Integer> task = ()->{System.out.println("Task - "+number+" "+Thread.currentThread().getName());
                return number*2; };
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            future.add(executor.submit(task));
        }
        for(Future<Integer> f :future)
        {
            try {
                System.out.println("Result : "+f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}