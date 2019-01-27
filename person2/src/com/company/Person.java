package com.company;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;

    private Person(String name, LocalDate date) {
        this.name = name;
        this.birthDate = date;
    }

    Person(String name, int day, int month, int yearOfBirth) {
        this(name, LocalDate.of(yearOfBirth, month, day));
    }

    Person(String name) {
        this(name, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

