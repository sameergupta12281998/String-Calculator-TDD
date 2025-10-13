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
}
