package com.vartuhope;

import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {
        // empty string returns zero
        if (numbers == null || numbers.isEmpty()) return 0;

        String nums = numbers;
        String header = null;
        if (nums.startsWith("//")) {
            int idxNewlineChar = nums.indexOf('\n');
            int idxBackslashN  = nums.indexOf("\\n");

            if (idxNewlineChar != -1 && (idxBackslashN == -1 || idxNewlineChar < idxBackslashN)) {
                // header up to the first newline character
                header = nums.substring(2, idxNewlineChar);
                nums = nums.substring(idxNewlineChar + 1);
            } else if (idxBackslashN != -1) {
                // header up to the first \n sequence
                header = nums.substring(2, idxBackslashN);
                nums = nums.substring(idxBackslashN + 2);
            } else {
                throw new IllegalArgumentException("Invalid custom delimiter header");
            }
        }
        // default delimiters: comma or newline
        String delimiterRegex = ",|\\r?\\n";
        if (header != null && !header.isEmpty()) {
            delimiterRegex = Pattern.quote(header) + "|" + delimiterRegex;
        }

        String[] tokens = nums.split(delimiterRegex);
        int sum = 0;
        for (String t : tokens) {
            if (t == null) continue;
            t = t.trim();
            if (t.isEmpty()) continue;
            // remove any stray carriage return characters
            t = t.replace("\r", "");
            sum += Integer.parseInt(t);
        }

        return sum;
    }
}
