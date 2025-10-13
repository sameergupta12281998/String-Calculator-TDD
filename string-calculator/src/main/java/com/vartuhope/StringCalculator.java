package com.vartuhope;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(numbers);

        int sum = 0;
        while (matcher.find()) {
            String numStr = matcher.group();
            int n = Integer.parseInt(numStr);
            sum += n;
        }

        return sum;
    }
}
