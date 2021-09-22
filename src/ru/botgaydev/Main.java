package ru.botgaydev;

public class Main {

    //HOMEWORK
    // 3 класса: 1.обработка вход. данных с консоли, 2. Логика, 3. связь с первыми двумя, 4. Тесты

    private static final String helloMessage =
            "Wassup. I'm bot. I can sell some useful info. For details, use \"/help\"";

    private static void startBot() {
        Console.write(helloMessage);
        Console.openIStream();
    }

    public static void main(String[] args) {
        startBot();
    }
}
