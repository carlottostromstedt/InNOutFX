package com.example.innoutfx;

public class Main {
    public static void main(String[] args) {
        Burger burger1 = new Cheese(new BeefBurger());
        Burger burger2 = new Bacon(new Cheese(new BeefBurger()));
        System.out.println(burger1.decorate());
        System.out.println(burger2.decorate());
    }
}