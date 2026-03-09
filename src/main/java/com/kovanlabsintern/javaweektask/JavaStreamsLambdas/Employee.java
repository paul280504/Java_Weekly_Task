package com.kovanlabsintern.javaweektask.JavaStreamsLambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String department;
    private double salary;
    Employee(String name, String department, double salary)
    {
        this.name =name;
        this.department=department;
        this.setSalary(salary);
    }
    public String getDepartment()
    {
        return this.department;
    }
    public String getName()
    {
        return this.name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return name;
    }
    public static void main(String[] args) {
        List<Employee> em = Arrays.asList(new Employee("Arun","Sales",15000),
                new Employee("Vijay","Sales",20000),
                new Employee("Zain", "Sales", 10000),
                new Employee("Praveen","HR",25000),
                new Employee("Kiran","HR",30000));
        System.out.println(em);

        //Highest in each Department
        Map<String, Optional<Employee>> m = em.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getName))));
        System.out.println("Highest in each Department"+m);

        //Max salary in the company
        Optional<Employee> n = em.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Max salary in the company"+n);

        //Average salary in department wise
        Map<String, Double> o = em.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average salary in department wise"+o);

        //Counting no. of employee in each department
        Map<String, Long> p = em.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println("Counting no. of employee in each department"+p);

        //Employee whose salary is greater than 20000
        List<Employee> q = em.stream()
                .filter(x -> x.getSalary()>20000)
                .collect(Collectors.toList());

        System.out.println("Employee whose salary is greater than 20000 :"+q);
    }
}
