package com.csc205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add()
    {
        // SEAT

        //Setup
        int expected = 4;
        int actual = new Calculator().add(2, 2);
        assertEquals(expected,actual);

    }// END:

    @Test
    void testAdd()
    {
        int expected = 6;
        int actual = new Calculator().add(2,2,2);

        assertEquals(expected,actual);
    }// END:

    @Test
    void subtract()
    {
        // SEAT
        int expected = 2;
        int actual = new Calculator().subtract(4,2);

        assertEquals(expected,actual);
    }// END:

    @Test
    void multiply()
    {
        // SEAT
        int expected = 4;
        int actual = new Calculator().multiply(2,2);

        assertEquals(expected,actual);
    }// END:

    @Test
    void divide()
    {
        int expected = 4;
        int actual = new Calculator().divide(8,2);

        assertEquals(expected,actual);
    }// END:

    @Test
    void divideByZero()
    {

        assertThrows(ArithmeticException.class,() -> {
            new Calculator().divide(0, 0);
        });
    }// END: divideByZero()
}