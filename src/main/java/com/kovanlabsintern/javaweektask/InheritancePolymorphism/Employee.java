package com.kovanlabsintern.javaweektask.InheritancePolymorphism;

import java.util.Scanner;

final public class Employee {
    final private String name;
    final private int id;
    Employee(String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public int getId() {
        return id;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee Id.no: ");
        int id = sc.nextInt();
        Employee e = new Employee(name,id);
        System.out.println("Employee Name :"+e.getName());
        System.out.println("Employee ID :"+e.getId());
    }
}
