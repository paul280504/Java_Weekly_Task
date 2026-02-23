package com.kovanlabsintern.javaweektask.InheritancePolymorphism;

import java.util.Arrays;

public class Shape_Factory {
    public static void main(String[] args)
    {
       Shape[] s = new Shape[]{new Circle(5),
                                new Circle(3),
                                new Square(4),
                                new Square(2)};
        double total = 0;
        for(Shape res : s)
        {
            total+=res.area();
        }
        System.out.println("Total Area: "+total);
    }
}
