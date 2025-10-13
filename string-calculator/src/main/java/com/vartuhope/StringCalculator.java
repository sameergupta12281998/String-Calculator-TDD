package com.vartuhope;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;


        if (!numbers.contains(",") && !numbers.contains("\n")) {
            try {
                return Integer.parseInt(numbers);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid number", e);
            }
        }

        throw new UnsupportedOperationException("Not implemented yet");
    }
}
