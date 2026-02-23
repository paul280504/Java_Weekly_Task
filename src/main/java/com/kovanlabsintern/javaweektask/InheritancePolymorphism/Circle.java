package com.kovanlabsintern.javaweektask.InheritancePolymorphism;

public class Circle extends Shape{
    int r;
    Circle(int r)
    {
        this.r =r;
    }
    @Override
    double area() {
        return Math.PI*Math.pow(r,2);
    }
}
