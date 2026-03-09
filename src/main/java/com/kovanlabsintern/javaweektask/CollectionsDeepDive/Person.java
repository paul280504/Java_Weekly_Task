package com.kovanlabsintern.javaweektask.CollectionsDeepDive;

import java.util.HashMap;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
        {
            return true;
        }
        if(!(obj instanceof Person))
            return false;
        Person p = (Person)obj;
        return Objects.equals(this.name,p.name) && this.age == p.age;
    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    public static void main(String[] args) {
        Person p1 = new Person("Paul",22);
        Person p2 = new Person("Paul",22);
        System.out.println(p1.equals(p2));

        HashMap<Object,String> h = new HashMap<>();
        h.put(p1,"cbe");
        h.put(p2,"cbe");
        System.out.println(h.size());
        System.out.println(h.get(p1));


    }
}
