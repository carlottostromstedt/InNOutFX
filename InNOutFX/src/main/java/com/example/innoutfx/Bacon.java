package com.example.innoutfx;

public class Bacon extends BurgerDecorator {
    static double price = 0.25;
    static String name = "Bacon";
    public Bacon(Burger burger){
        super(burger);
    };

    public String decorate() {
        return super.decorate() + topWithBacon();
    }

    private String topWithBacon() {
        return " with Bacon";
    }
}
