package com.kovanlabsintern.javaweektask.InheritancePolymorphism;

public class Square extends Shape{
    int s;
    Square(int s)
    {
        this.s=s;
    }
    double area()
    {
        return Math.pow(s,2);
    }
}
