package com.example.innoutfx;

public class Onion extends BurgerDecorator{
    static double price = 0.20;
    static String name = "Onion";
    public Onion(Burger burger) {
        super(burger);
    }

    public String decorate() {
        return super.decorate() + topWithOnion();
    }

    private String topWithOnion() {
        return " with Onion";
    }
}
