package ru.botgaydev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    public static String read()
            throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // Reading data using readLine
        return reader.readLine();
    }
    public static void write(String str) {
        System.out.println(str);
    }
}
