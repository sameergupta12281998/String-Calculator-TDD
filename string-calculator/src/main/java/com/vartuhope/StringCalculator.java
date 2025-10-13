package com.vartuhope;

public class StringCalculator {

    // Adds numbers in a string, 
    //separated by commas or newlines,
    // multiple Numbers allowed

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;

        if (!numbers.contains(",") && !numbers.contains("\n")) {
            return Integer.parseInt(numbers);
        }

        String[] tokens = numbers.split(",|\n");
        int sum = 0;
        for (String t : tokens) {
            if (t.isEmpty()) continue;
            sum += Integer.parseInt(t);
        }
        return sum;
    }
}
