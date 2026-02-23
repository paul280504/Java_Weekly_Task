package com.kovanlabsintern.javaweektask;

abstract class Character
{
    int strength = 0;
    int health;
    Character(int health)
    {
        this.health=health;
    }
    abstract void attack(Character opponent);
}

class Warrior extends Character
{
    int strength=25;
    int health;
    Warrior(int health) {
        super(health);
        this.health=health;
    }
    @Override
    void attack(Character opponent) {
        System.out.println("Warrior -> Strike");
        if(opponent instanceof Rouge)
        {
            int strike=strength*(int)(Math.random()*10);
            if(strike>=75)
            {
                opponent.health-=strike;
                System.out.println("Opponent Health reduced to "+opponent.health);
            }
            else {
                System.out.println("Dodges your attack");
            }
        }
        else
        {
            opponent.health-=strength*(int)(Math.random()*10);
            System.out.println("Opponent Health reduced to "+opponent.health);
        }
    }
}
class Mage extends Character
{
    int strength = 30;
    int health;
    Mage(int health) {
        super(health);
        this.health=health;
    }

    @Override
    void attack(Character opponent) {
        System.out.println("Mage -> Casting spell");
        if(opponent instanceof Rouge)
        {
            int strike=strength*(int)(Math.random()*10);
            if(strike>=75)
            {
                opponent.health-=strike;
                System.out.println("Opponent Health reduced to "+opponent.health);
            }
            else
            {
                System.out.println("Dodges your spell");
            }
        }
        else
        {
            opponent.health-=strength*(int)(Math.random()*10);
            System.out.println("Opponent Health reduced to "+opponent.health);
        }
    }
}
class Rouge extends Character
{
    int strength = 10;
    int health;
    Rouge(int health) {
        super(health);
        this.health=health;
    }

    @Override
    void attack(Character opponent) {
        System.out.println("Rouge -> Strike");
        opponent.health-=strength*(int)(Math.random()*10) ;
        System.out.println("Opponent Health reduced to "+opponent.health);
    }

}
public class Arena {
    public static void main(String[] args) {
        Character w = new Warrior(700);
        Character r = new Rouge(500);
        while(w.health>0 && r.health>0)
        {
            w.attack(r);
            r.attack(w);
        }
        if(w.health>0)
        {
            System.out.println(w.getClass().getSimpleName()+" is the winner");
        }
        else
        {
            System.out.println(r.getClass().getSimpleName()+" is the winner");
        }
    }
}
