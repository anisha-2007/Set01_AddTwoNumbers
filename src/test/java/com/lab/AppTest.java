package com.lab;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(30, App.add(10, 20));
    }

    @Test
    public void testAdditionWithZero() {
        assertEquals(5, App.add(5, 0));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        assertEquals(-5, App.add(-2, -3));
    }
}