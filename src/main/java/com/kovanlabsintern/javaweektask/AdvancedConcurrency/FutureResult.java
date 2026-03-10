package com.kovanlabsintern.javaweektask.AdvancedConcurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureResult {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Future<Integer>> f = new ArrayList<>();
        int[] a = {1,2,3,4};
        for(int i=0;i<4;i++)
        {
            int num = i;
            Callable<Integer> task = ()->{
                System.out.println("Task - "+(num+1)+" "+Thread.currentThread().getName());
                return a[num]*2;
            };
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            f.add(executor.submit(task));
        }
        for(Future<Integer> future : f)
        {
            try {
                System.out.println("Result : "+future.get(2,TimeUnit.SECONDS));
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                e.printStackTrace();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Main : "+a[i]*2);
        }
        executor.shutdown();
    }
}
