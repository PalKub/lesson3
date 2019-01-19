package isa;

import java.sql.SQLOutput;

public class Menu {
    public int number;
    public String text;
    public int varInt;
    public Integer varInteger;
    public Marka car = Marka.POLONEZ;

    public Menu(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public Menu() {

    }

    public String format() {
        return "*" + number + text + "*";
    }

    public void gettype(){
        System.out.println(text.getClass());
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public int getVarInt() {
        return varInt;
    }

    public Integer getVarInteger() {
        return varInteger;
    }




    public Marka getCar() {
        return car;
    }



}

