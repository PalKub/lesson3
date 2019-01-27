package com.company;

public class Main {
    public static void main(String args[]) {
        Person p1 = new Person("John");
        Person p2 = new Person("Harry");
        p2.setAge(21);
        Person p3 = new Person("  ");
        p3.setAge(-5);

        p1.introduceYourself();
        p2.introduceYourself();
        p3.introduceYourself();
        Person.printPopulation();
    }
}
