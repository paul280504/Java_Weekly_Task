package com.kovanlabsintern.javaweektask.CompositionoverInheritance;

class Processor
{
    Processor(String processorName)
    {
        System.out.println(processorName);
    }
}
class Storage
{
    Storage(int ssd)
    {
        System.out.println("Nvme SSD - "+ssd+"GB");
    }
}
class Ram1
{
    Ram1(int ram)
    {
        System.out.println("DDR4 - "+ram+"GB");
    }
}
public class Computer {
    public static void main(String[] args) {
        new Processor("intel i5");
        new Storage(256);
        new Ram1(8);
    }
}
