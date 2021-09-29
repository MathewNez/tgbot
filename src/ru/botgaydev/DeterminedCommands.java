package ru.botgaydev;

import java.util.HashMap;
import java.util.Map;

public class DeterminedCommands {
    public  Map<String, String> answers = new HashMap<>();


    public DeterminedCommands() {
        answers.put("/help", "help..."); // TODO дописать нормальную справку
        // Далее по аналогии вбиваешь комманды для бота и ответы на них
        // Этот класс только для ДЕТЕРМЕНИРОВАННЫХ команд (имеют однозначный вызов и однозначный ответ.)
        // Для комманд с параметрами создадим отдельный класс по ходу дела. Щас нам бы пока с однозначными логику наладить
    }

    public Response method(Request req) { //переназвать метод на нормальное понятное имя
        //добавить логику
        return new Response();
    }

}
