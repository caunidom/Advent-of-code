package com.company.day1;

import com.company.FileReader;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class Part2 {
    private static final String INPUT = FileReader.readTextFile("C:\\Users\\cauni\\AppData\\Roaming\\Advent_of_code\\src\\com\\company\\day1\\input");
    private static final Map<String, String> digitMap = Map.of(
            "one", "o1e",
            "two", "t2o",
            "three", "t3e",
            "four", "f4r",
            "five", "f5e",
            "six", "s6x",
            "seven", "s7n",
            "eight", "e8t",
            "nine", "n9e"
    );

    public static void main(String[] args) {
        var res = streamLines(filterNumbers(INPUT))
                .mapToInt(Part2::buildNumber)
                .sum();
        System.out.println(res);
    }

    private static String filterNumbers(String text) {
        for (Map.Entry<String, String> entry : digitMap.entrySet()) {
            text = text.replaceAll(entry.getKey(), entry.getValue());
        }
        return text.replaceAll("[a-z]", "");
    }

    private static Stream<String> streamLines(String text) {
        return Arrays.stream(text.split("\\r\\n"));
    }

    private static Integer buildNumber(String numbers) {
        return Integer.parseInt(numbers.charAt(0) + "" + numbers.charAt(numbers.length() - 1));
    }
}
