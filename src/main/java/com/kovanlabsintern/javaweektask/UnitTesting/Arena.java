package com.kovanlabsintern.javaweektask.UnitTesting;

public class Arena {

    public static void main(String[] args) throws Exception
    {
        Characters p1 = new Warrior(700,25,5);
        Characters p2 = new Mage(700,20);
        while(p1.getHealth()>0 && p2.getHealth()>0)
        {
            p1.attack(p2);
            p2.attack(p1);
        }
        if(p1.getHealth()>0)
        {
            System.out.println(p1.getClass().getSimpleName()+" is the winner");
        }
        else
        {
            System.out.println(p2.getClass().getSimpleName()+" is the winner");
        }
    }
}
