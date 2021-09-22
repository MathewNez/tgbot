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

    public static void openIStream() {
        while (true) {
            try {
                read();
            } catch (IOException e) {
                System.out.println("Sorry, something went wrong, here are the details:");
                e.printStackTrace();
            }
        }
    }
}
