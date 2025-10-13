package com.vartuhope;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
   
    @Test
    void emptyStringReturnsZero() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));
    }

    @Test
    void singleNumberReturnsValue() {
        StringCalculator calc = new StringCalculator();
        assertEquals(1, calc.add("1"));
        assertEquals(42, calc.add("42"));
    }

    @Test
    void twoNumbersCommaSeparated() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1,5"));
        assertEquals(30, calc.add("10,20"));
    }


    @Test
    void multipleNumbers() {
        StringCalculator calc = new StringCalculator();
        assertEquals(15, calc.add("1,2,3,4,5"));
    }

    @Test
    void newlinesBetweenNumbers() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1\n2,3"));
        assertEquals(15, calc.add("4\n5\n6"));
    }

    @Test
    void customSingleCharDelimiter() {
        StringCalculator calc = new StringCalculator();
        assertEquals(3, calc.add("//;\\n1;2"));
        assertEquals(9, calc.add("//*\\n2*3*4"));
    }

}

