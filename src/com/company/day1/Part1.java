package com.company.day1;

import com.company.FileReader;

import java.util.Arrays;
import java.util.stream.Stream;

public class Part1 {

    private static final String INPUT = FileReader.readTextFile("C:\\Users\\cauni\\AppData\\Roaming\\Advent_of_code\\src\\com\\company\\day1\\input");

    public static void main(String[] args) {
        var res = streamLines(filterNumbers(INPUT))
                .mapToInt(Part1::buildNumber)
                .sum();
        System.out.println(res);
    }

    private static String filterNumbers(String text) {
        return text.replaceAll("[^0-9\\n]", "");
    }

    private static Stream<String> streamLines(String text) {
        return Arrays.stream(text.split("\\n"));
    }

    private static Integer buildNumber(String numbers) {
        return Integer.parseInt(numbers.charAt(0) + "" + numbers.charAt(numbers.length() - 1));
    }
}
