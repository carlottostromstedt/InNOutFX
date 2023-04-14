package com.example.innoutfx;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeefBurgerTest {

    @Test
    public void testDecorate() {
        Burger burger = new BeefBurger();

        String expected = "Beef Burger";
        String actual = burger.decorate();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrice() {
        Burger burger = new BeefBurger();

        double expected = BeefBurger.price;
        double actual = 1.3;

        assertEquals(expected, actual, 0.0);
    }

}