package com.example.innoutfx;

public class BurgerDecorator implements Burger{
    private Burger burger;

    public BurgerDecorator(Burger burger){
        this.burger = burger;
    };
    public String decorate(){
        return burger.decorate();
    };
}
