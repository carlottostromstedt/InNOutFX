package com.example.innoutfx;

import org.junit.Test;

import static org.junit.Assert.*;

public class OnionTest {
    @Test
    public void testDecorate() {
        Burger burger = new BeefBurger();
        Onion onion = new Onion(burger);

        String expected = "Beef Burger with Onion";
        String actual = onion.decorate();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrice() {
        Burger burger = new BeefBurger();
        Onion onion = new Onion(burger);

        double expected = BeefBurger.price + Onion.price;
        double actual = 1.5;

        assertEquals(expected, actual, 0.0);
    }
}