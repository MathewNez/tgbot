package ru.botgaydev.bot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class Start {
    public static void main (String[] args) throws TelegramApiException, IOException {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new BotTg("GoodsSeller", getToken()));
    }
    private static String getToken() throws IOException {
        String rootPath = Objects.requireNonNull(Start.class.getClassLoader().getResource("config.properties")).getPath();     //TODO move properties to resources start.class.getClassLoader
        Properties prop = new Properties();
        prop.load(new FileInputStream(rootPath));
        return prop.getProperty("token");
    }
}
