package com.example.innoutfx;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaladTest {
    @Test
    public void testDecorate() {
        Burger burger = new BeefBurger();
        Salad salad = new Salad(burger);

        String expected = "Beef Burger with Salad";
        String actual = salad.decorate();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrice() {
        Burger burger = new BeefBurger();
        Salad salad = new Salad(burger);

        double expected = Double.parseDouble(String.format("%.2f", (BeefBurger.price + Salad.price)));
        double actual = 1.4;

        assertEquals(expected, actual, 0.0);
    }

}