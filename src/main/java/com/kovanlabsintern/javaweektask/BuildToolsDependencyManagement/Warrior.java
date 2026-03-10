package com.kovanlabsintern.javaweektask.BuildToolsDependencyManagement;

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
        System.out.println("Warrior -> strike\n "+opponent.getClass().getSimpleName()+" Health reduced to "+opponent.getHealth());
    }
}
