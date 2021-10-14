package ru.botgaydev.bot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Start {
    public static void main (String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new BotTgApi("GoodsSeller", "")); // TODO убрать этот пипец и сделать нормально
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
