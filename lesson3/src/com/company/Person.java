package com.company;


public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private String nick;

    public Person(String name, String surname, String nick) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
    }

    public Person() {

    }

    public String toString() {
        return name + " " + nick + " " + surname;
    }

    public int compareTo(Person a) {

        return this.surname.compareTo(a.surname);
    }
}
