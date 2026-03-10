package com.kovanlabsintern.javaweektask.UnitTesting;

class Rogue extends Characters
{

    Rogue(int health,int strength) {
        super(health,strength);
    }

    @Override
    void attack(Characters opponent) {
        Warrior warrior = (Warrior) opponent;
        if(opponent instanceof Warrior && warrior.getStrength()>this.getStrength())
        {
            if(warrior.getShield()>0)
            {
                System.out.println("Rogue -> attack \nWarrior -> Proteted by shield");
                warrior.setShield(warrior.getShield()-1);
            }
            else
            {
                warrior.setHealth(warrior.getHealth()-getStrength()*(int)(Math.random()*10));
                System.out.println("Rogue -> attack\n"+opponent.getClass().getSimpleName()+" Health reduced to "+opponent.getHealth());
            }

        }
        else
        {
            opponent.setHealth(opponent.getHealth() - getStrength()*(int)(Math.random()*10));
            System.out.println("Rogue -> attack\n"+opponent.getClass().getSimpleName()+" Health reduced to "+opponent.getHealth());
        }
    }

}
