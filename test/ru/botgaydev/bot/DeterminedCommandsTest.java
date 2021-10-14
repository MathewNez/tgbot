package ru.botgaydev.bot;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.junit.Test;
import ru.botgaydev.bot.DeterminedCommands;
import ru.botgaydev.bot.Request;

import static org.junit.Assert.*;

public class DeterminedCommandsTest {

    @Test
    public void testBuyCommand() {
        DeterminedCommands commandHandler = new DeterminedCommands();
        Request req = new Request();
        req.setBody("/buy");

        assertEquals("показываю категории доступные к покупке", commandHandler.handle(req).getBody());
    }
}