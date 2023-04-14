package com.example.innoutfx;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaconTest {
    @Test
    public void testDecorate() {
        Burger burger = new BeefBurger();
        Bacon bacon = new Bacon(burger);

        String expected = "Beef Burger with Bacon";
        String actual = bacon.decorate();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrice() {
        Burger burger = new BeefBurger();
        Bacon bacon = new Bacon(burger);

        double expected = BeefBurger.price + Cheese.price;
        double actual = 1.57;

        assertEquals(expected, actual, 0.0);
    }

}