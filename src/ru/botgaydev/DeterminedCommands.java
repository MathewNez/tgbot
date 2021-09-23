package ru.botgaydev;

import java.util.HashMap;
import java.util.Map;

public class DeterminedCommands {
    public  Map<String, String> answers = new HashMap<>();

    public DeterminedCommands() {
        answers.put("/help", "help...");
    }
}
