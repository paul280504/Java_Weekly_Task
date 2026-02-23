package com.kovanlabsintern.javaweektask;

import java.util.Scanner;

enum Operation
{
    ADD
            {
                public double apply(double x, double y)
                {
                    return x+y;
                }
            },
    SUBTRACT
            {
                public double apply(double x, double y)
                {
                    return x-y;
                }
            },
    MULTIPLY
            {
                public double apply(double x, double y)
                {
                    return x*y;
                }
            },
    DIVISION
            {
                public double apply(double x, double y)
                {
                    return x/y;
                }
            };
    public abstract double apply(double x, double y);
}


public class MathOperationEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to perform Calculation: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("1. Addition \n2. Subtract \n3. Multiply \n4. division \nSelect a operation to perform : ");
        int opt = sc.nextInt();
        switch(opt)
        {
            case 1 -> System.out.println(x+" + "+y+" = "+Operation.ADD.apply(x, y));
            case 2 -> System.out.println(x+" - "+y+" = "+Operation.SUBTRACT.apply(x, y));
            case 3 -> System.out.println(x+" x "+y+" = "+Operation.MULTIPLY.apply(x, y));
            case 4 -> System.out.println(x+" / "+y+" = "+Operation.DIVISION.apply(x, y));
            default -> System.out.println("Enter a valid input");
        }
        sc.close();
    }

}