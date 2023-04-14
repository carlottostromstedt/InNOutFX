package com.example.innoutfx;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheeseTest {

    @Test
    public void testDecorate() {
        Burger burger = new BeefBurger();
        Cheese cheese = new Cheese(burger);

        String expected = "Beef Burger with Cheese";
        String actual = cheese.decorate();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrice() {
        Burger burger = new BeefBurger();
        Cheese cheese = new Cheese(burger);

        double expected = BeefBurger.price + Cheese.price;
        double actual = 1.57;

        assertEquals(expected, actual, 0.0);
    }
}