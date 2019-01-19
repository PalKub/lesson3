package com.company;

import java.util.Scanner;

public class Scan {
    public void number() {
        Scanner numb = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        while (numb.hasNext()) {
            try {
                numb.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Źle. Podaj liczbę całkowita");
            }
            numb.next();
        }
    }

}
