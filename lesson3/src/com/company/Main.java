package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*Scan numInt = new Scan();
        numInt.number();

        Person adam = new Person("Adam", "Nowak", "Łysy");
        Person robert = new Person("Robert", "Kubica", "Dachowanie");
        Person jan = new Person("Jan", "Kowalski", "Mały");

        ArrayList<Person> list = new ArrayList<>();
        list.add(adam);
        list.add(robert);
        list.add(jan);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list); */

        Lotto lotto = new Lotto();
        lotto.roll();
    }
}
