package com.kovanlabsintern.javaweektask.FileIOSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
abstract class Characters implements Serializable
{
    private int strength;
    private int health;
    Characters(int health,int strength)
    {
        this.setHealth(health);
        this.setStrength(strength);
    }
    abstract void attack(Characters opponent);
    public int getStrength()
    {
        return strength;
    }
    public void setStrength(int strength)
    {
        this.strength = strength;
    }
    public int getHealth()
    {
        return health;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }
}



@SuppressWarnings("serial")
class Warrior extends Characters
{
    private int shield;
    Warrior(int health,int strength,int shield)
    {
        super(health,strength);
        this.shield=shield;
    }
    int setShield(int shield)
    {
        return this.shield=shield;
    }
    int getShield()
    {
        return shield;
    }
    @Override
    void attack(Characters opponent)
    {
        opponent.setHealth(opponent.getHealth() - getStrength()*(int)(Math.random()*10));
        System.out.println("Warrior -> strike\n"+opponent.getClass().getSimpleName()+" Health reduced to "+opponent.getHealth());
    }
}


@SuppressWarnings("serial")
class Mage extends Characters
{

    Mage(int health,int strength)
    {
        super(health,strength);
    }

    @Override
    void attack(Characters opponent)
    {
        Warrior warrior = (Warrior) opponent;
        if(opponent instanceof Warrior && warrior.getStrength()>this.getStrength())
        {
            if(warrior.getShield()>0)
            {
                System.out.println("Mage -> Casting spell \nWarrior -> Proteted by shield");
                warrior.setShield(warrior.getShield()-1);
            }
            else
            {
                warrior.setHealth(warrior.getHealth()-getStrength()*(int)(Math.random()*10));
                System.out.println("Mage -> Casting spell\n"+opponent.getClass().getSimpleName()+" Health reduced to "+opponent.getHealth());
            }

        }
        else
        {
            opponent.setHealth(opponent.getHealth() - getStrength()*(int)(Math.random()*10));
            System.out.println("Mage -> Casting spell\n"+opponent.getClass().getSimpleName()+" Health reduced to "+opponent.getHealth());
        }
    }
}


@SuppressWarnings("serial")
class Rouge extends Characters
{

    Rouge(int health,int strength) {
        super(health,strength);
    }

    @Override
    void attack(Characters opponent) {
        Warrior warrior = (Warrior) opponent;
        if(opponent instanceof Warrior && warrior.getStrength()>this.getStrength())
        {
            if(warrior.getShield()>0)
            {
                System.out.println("Mage -> Casting spell \nWarrior -> Proteted by shield");
                warrior.setShield(warrior.getShield()-1);
            }
            else
            {
                warrior.setHealth(warrior.getHealth()-getStrength()*(int)(Math.random()*10));
                System.out.println("Mage -> Casting spell\n"+opponent.getClass().getSimpleName()+" Health reduced to "+opponent.getHealth());
            }

        }
        else
        {
            opponent.setHealth(opponent.getHealth() - getStrength()*(int)(Math.random()*10));
            System.out.println("Mage -> Casting spell\n"+opponent.getClass().getSimpleName()+" Health reduced to "+opponent.getHealth());
        }
    }

}
public class Arena {

    public static void main(String[] args) throws Exception
    {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("character.dat"))) {
            Characters p1 = (Characters) in.readObject();
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
}
