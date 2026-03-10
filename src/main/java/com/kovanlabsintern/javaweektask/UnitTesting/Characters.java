package com.kovanlabsintern.javaweektask.UnitTesting;

public abstract class Characters
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
        this.health = Math.max(0, health);
    }
}
