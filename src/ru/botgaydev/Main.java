package ru.botgaydev;

import java.io.IOException;

public class Main {

    //HOMEWORK
    // 3 класса: 1.обработка вход. данных с консоли, 2. Логика, 3. связь с первыми двумя, 4. Тесты

    private static final String helloMessage =
            "Wassup. I'm bot. I can sell some useful info. For details, use \"/help\"";

    public static void openIStream() {
        while (true) {
            try {
                String request = Console.read();    //TODO создать класс под сущность Request
            } catch (IOException e) {
                System.out.println("Sorry, something went wrong, here are the details:");
                e.printStackTrace();
            }
        }
    }

    private static void startBot() {
        Console.write(helloMessage);
        openIStream();
    }

    public static void main(String[] args) {
        startBot();
    }
}
