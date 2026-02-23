package com.kovanlabsintern.javaweektask.CompositionoverInheritance;

class Ram{
    private int ram;
    public void ramInstall(int ram)
    {
        if(ram>this.ram && ram%2==0)
        {
            this.ram=ram;
            System.out.println("Ram Upgraded");
        }
        else
        {
            System.out.println("Invalid Ram card Size installation");
        }
        System.out.println("Current Ram Size:"+this.ram);
    }

}

public class Computer1 {

    public void upgradeRam(int ram)
    {
        new Ram().ramInstall(ram);
    }
    public static void main(String[] args) {
        Computer1 c = new Computer1();
        c.upgradeRam(8);
        c.upgradeRam(16);
    }
}
