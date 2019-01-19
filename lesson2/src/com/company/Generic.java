package com.company;

public class Generic<T> {
    private T item;

    public Generic(T item) {
        this.item = item;
    }

    public void klasa(){
        System.out.println(item.getClass());
    }
}
