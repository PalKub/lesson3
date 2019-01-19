package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
    private int rng;
    private int hwmn;

    public void range(){
        System.out.println("Podaj zakres");
        rng = number();

    }

    public void howMany(){
        System.out.println("Podaj ilość losowanych liczb");
        hwmn = number();
        while(hwmn>rng){
            System.out.println("Ilość nie może być większa od zakresu");
            hwmn = number();
        }
    }

    public int number() {
        int a =0;
        Scanner numb = new Scanner(System.in);
        while (numb.hasNext()) {
                try {
                    a = numb.nextInt();
                    if(a>0) {
                        break;
                    }

                } catch (Exception e) {
                    System.out.println("Źle. Podaj liczbę całkowitą większą od 0");
                }

            numb.next();
        }
        return a;
    }

    public void roll(){
        Set<Integer> numbers = new HashSet<Integer>();
        range();
        howMany();
        while(true){
            numbers.add((int)(Math.random() * rng + 1));
            if((numbers.size()== hwmn)){
               break;
            }
        }
        for(int whatever : numbers){
            System.out.println(whatever);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}

