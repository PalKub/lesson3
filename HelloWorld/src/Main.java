import isa.Kalkulator;
import isa.Marka;
import isa.Menu;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        Menu sth = new Menu(11, "tekst");

        sth.setNumber(4);
        sth.setText("text");

        System.out.println(sth.getText());
        System.out.println(sth.getNumber());

        int suma = new Kalkulator().sum(4,6);
        System.out.println(suma);


        System.out.println(sth.format());
        sth.gettype();

        System.out.println(sth.toString());

        System.out.println(sth.getVarInt()+" "+sth.getVarInteger());
        System.out.println(sth.getVarInteger());
        System.out.println(sth.getCar());

        Menu menu1 = new Menu();
        Menu menu2 = new Menu();

        menu1.setNumber(1);
        menu2.setNumber(2);

        if (menu1.getNumber() == 1){
            System.out.println(menu1.getCar());
        }
        if(menu2.getNumber() ==2){
            System.out.println(menu2.getCar());

        }

        String tekstA =  new String ("tekst");
        String tekstB = new String ("tekst");

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

    }


}
