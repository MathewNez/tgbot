package ru.botgaydev.bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Console {
    private final Scanner reader = new Scanner(System.in);

    public Request read() throws IOException {
        Request request = new Request();
        request.setBody(reader.nextLine());
        return request;
    }

    public void write(String str) {
        System.out.println(str);
    }
}

