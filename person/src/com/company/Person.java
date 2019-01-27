package com.company;

import static java.lang.System.*;

class Person {
    private String name;
    private int age;
    private static int peopleCount;

    Person(String name) {
        if (name != null && name.trim().length() > 1) {
            this.name = name;
            peopleCount +=1;
        } else {
            this.name = "no name given";
        }
    }

    void introduceYourself() {
        out.println("Hi, my name is "
                + name + " and I'm " + age + " years old.");
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    static void printPopulation() {
        out.println(peopleCount);
    }
}