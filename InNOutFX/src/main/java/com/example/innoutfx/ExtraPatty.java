package com.example.innoutfx;

public class ExtraPatty extends BurgerDecorator{
    static String name = "Extra Patty";
    public ExtraPatty(Burger burger) {
        super(burger);
    }

    public String decorate() {
        return super.decorate() + topWithPatty();
    }

    private String topWithPatty() {
        return " with Extra Patty";
    }
}
