package com.vartuhope;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;

        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(numbers);

        int sum = 0;
        String negatives = "";
        while (matcher.find()) {
            String numStr = matcher.group();
            int n = Integer.parseInt(numStr);
            if (n < 0) {
                negatives += (negatives.isEmpty() ? "" : ",") + n;
            } else {
                sum += n;
            }
        }

        if (!negatives.isEmpty()) {
            throw new NegativeNumberException("negative numbers not allowed : " + negatives);
        }

        return sum;
    }



    public static class NegativeNumberException extends IllegalArgumentException {
        public NegativeNumberException(String message) { super(message); }
    }
}
