package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.*;

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

        //Lotto lotto = new Lotto();
        //lotto.roll();

        /*StringBuilder builder = new StringBuilder();
        builder.append("info#");
        builder.append("Share#");
        builder.append("Academy#");
        String string1 = builder.toString();
        String[] tab = string1.split("#");
        for (String whatever : tab) {
            System.out.println(whatever);
        }
        System.out.println("Ilość wyrazów to: " + tab.length);*/

        /*ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();

        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");

        list2.addAll(list1);
        list3.addAll(list1);

        Map<Integer, ArrayList<String>> mapa = new HashMap<>();
        mapa.put(1, list1);
        mapa.put(2, list2);
        mapa.put(3, list3);

        System.out.println(mapa.keySet());
        System.out.println(mapa.values());*/

        try {
            FileReader in = new FileReader("/home/jakubpaluch/IdeaProjects/lesson3/src/com/company/hello.txt");
            BufferedReader in1 = new BufferedReader(in);
            String l;
            while ((l = in1.readLine()) !=null) {
                System.out.println(l);
            }
        } catch (Exception e) {

        }

    }
}
