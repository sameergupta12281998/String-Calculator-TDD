package com.vartuhope;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;


        if (!numbers.contains(",") && !numbers.contains("\n")) {
            return Integer.parseInt(numbers);
        }

        // split on comma for now
        String[] tokens = numbers.split(",");
        int sum = 0;
        for (String t : tokens) {
            if (t.isEmpty()) continue;
            sum += Integer.parseInt(t);
        }
        return sum;
    }
}
