package ru.botgaydev.bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Console {
    private final Scanner reader = new Scanner(System.in);

    public String read() throws IOException {
        return reader.nextLine();
    }

    public void write(String str) {
        System.out.println(str);
    }
}

