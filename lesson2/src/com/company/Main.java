package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String tekstA = new String("tekst");
        String tekstB = new String("tekst");

        if (tekstA == tekstB) {
            System.out.println("Warunek prawdziwy");
        }

        if (tekstA.equals(tekstB)) {
            System.out.println("warunek equals prawdziwy");
        }

        System.out.println(tekstA.hashCode());
        System.out.println(tekstB.hashCode());

        String s1 = "INFOShare";
        String s2 = new String("infoShare");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s2.compareTo(s1));

        array(9);

        String a = "jeden";
        String b = "dwa";
        String c = "trzy";
        String d = "trzy";

        Set<String> zbior = new HashSet<String>();
        zbior.add(a);
        zbior.add(b);
        zbior.add(c);
        zbior.add(d);
        for (String costam : zbior) {
            System.out.println(costam);
        }

        List<String> lista = new ArrayList<String>();
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        for (String cos : lista) {
            System.out.println(cos);
        }

        Map<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, a);
        mapa.put(1, b);
        mapa.put(2, c);
        mapa.put(3, d);
        for (Integer klucz : mapa.keySet()) {
            System.out.println(mapa.get(klucz));
            System.out.println(klucz.toString());
        }
        System.out.println(mapa.values());
        System.out.println(mapa.entrySet());

        Animal zwierze = new Animal();
        Bird ptak = new Bird();
        Mamal ssak = new Mamal();
        zwierze.eat();
        ptak.eat();
        ssak.eat();

        Generic klasa = new Generic("test");
        klasa.klasa();

        Integer[] tab2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        try {
            int x = tab2[15];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nie ma takiego elementu");
        }

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            try {
                int y = input.nextInt();
            } catch (Exception e) {
                System.out.println("Podaj inta");
            }
            finally {
                input.next();
            }
        }

    }

    public static void array(int a) {
        int[] tab1 = new int[10];
        for (int i = 0; i < 10; i++) {
            tab1[i] = a;
            a += 1;
            System.out.println(tab1[i]);
        }
    }
}
