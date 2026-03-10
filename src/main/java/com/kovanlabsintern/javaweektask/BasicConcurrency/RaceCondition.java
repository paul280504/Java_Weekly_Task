package com.kovanlabsintern.javaweektask.BasicConcurrency;

public class RaceCondition extends Thread{
	static int count = 0;
//	public static synchronized void increase()
//	{
//		count++;
//	}
    public static void increase()
    {
        count++;
    }
	public void run()
	{
		for(int i =0;i<1000;i++)
		{
			increase();
		}
	}
	public static void main(String[] args) {

		RaceCondition[] t = new RaceCondition[10];
		for(int i=0;i<10;i++)
		{
			t[i] = new RaceCondition();
			t[i].start();
		}
		for(int j=0;j<10;j++)
		{
			try {
				t[j].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("The Total count :"+count);
	}
}
