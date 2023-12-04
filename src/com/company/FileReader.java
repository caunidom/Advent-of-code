package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public static String readTextFile(String path) {
        try {
            return Files.readString(Paths.get(path));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return "";
        }
    }
}
