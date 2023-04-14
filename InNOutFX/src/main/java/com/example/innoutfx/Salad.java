package com.example.innoutfx;

public class Salad extends BurgerDecorator{

    static double price = 0.10;
    static String name = "Salad";
    public Salad(Burger burger) {
        super(burger);
    }

    public String decorate() {
        return super.decorate() + topWithSalad();
    }

    private String topWithSalad() {
        return " with Salad";
    }
}
