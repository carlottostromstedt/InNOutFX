package com.example.innoutfx;

public class Cheese extends BurgerDecorator{

    static double price = 0.27;
    static String name = "Cheese";
    public Cheese(Burger burger){
        super(burger);
    };

    public String decorate() {
        return super.decorate() + topWithCheese();
    }

    private String topWithCheese() {
        return " with Cheese";
    }

    public double getPrice() {
        return price;
    }
}
