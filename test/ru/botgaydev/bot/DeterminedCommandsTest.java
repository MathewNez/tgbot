package ru.botgaydev.bot;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.junit.Test;
import ru.botgaydev.bot.DeterminedCommands;
import ru.botgaydev.bot.Request;

import static org.junit.Assert.*;

public class DeterminedCommandsTest {

    @Test
    public void testHelpCommand() {
        DeterminedCommands commandHandler = new DeterminedCommands();
        Request req = new Request();
        req.setBody("/help");

        assertEquals("Вся продукция в боте выставлена в ознакомительных целях и подзарумевает под собой " +
                "бесплатные позиции, выдаваемые в качестве поощрения за пожертвования. Любое использование какого-либо " +
                        "продукта / услуги в боте, противоречащее законодательству РФ, запрещено!\n" +
                        "\n" +
                        "Список команд\n" +
                        "/availability - товары в наличии\n" +
                        "/buy - категории к покупке\n" +
                        "/deposit - пополнение баланса\n" +
                        "/find - поиск товара\n" +
                        "/account - информация об аккаунте\n" +
                        "/ref_code - реферальный код\n" +
                        "/ref_list - список приглашенных людей\n" +
                        "/rules - правила\n" +
                        "\n" +
                        "Контакты\n" +
                        "Заведующий по заведующим: @m3f3w_1337\n" +
                        "Заведующий по заведению: @vladslav008", commandHandler.handle(req).getBody());
    }

    @Test
    public void testAvailabilityCommand() {
        DeterminedCommands commandHandler = new DeterminedCommands();
        Request req = new Request();
        req.setBody("/availability");

        assertEquals("я должен показать, что есть в наличии", commandHandler.handle(req).getBody());
    }

    @Test
    public void testBuyCommand() {
        DeterminedCommands commandHandler = new DeterminedCommands();
        Request req = new Request();
        req.setBody("/deposit");

        assertEquals("пополнение баланса", commandHandler.handle(req).getBody());
    }

    @Test
    public void testFindCommand() {
        DeterminedCommands commandHandler = new DeterminedCommands();
        Request req = new Request();
        req.setBody("/find");

        assertEquals("выполняю поиск по заголовкам", commandHandler.handle(req).getBody());
    }

    @Test
    public void testAccountCommand() {
        DeterminedCommands commandHandler = new DeterminedCommands();
        Request req = new Request();
        req.setBody("/account");

        assertEquals("инфо об акканте: ID, логин, счёт", commandHandler.handle(req).getBody());
    }

    @Test
    public void testRef_codeCommand() {
        DeterminedCommands commandHandler = new DeterminedCommands();
        Request req = new Request();
        req.setBody("/ref_code");

        assertEquals("реферальный код для приглашения новых пользователей", commandHandler.handle(req).getBody());
    }

    @Test
    public void testRef_listCommand() {
        DeterminedCommands commandHandler = new DeterminedCommands();
        Request req = new Request();
        req.setBody("/ref_list");

        assertEquals("список рефералов", commandHandler.handle(req).getBody());
    }

    @Test
    public void testRulesCommand() {
        DeterminedCommands commandHandler = new DeterminedCommands();
        Request req = new Request();
        req.setBody("/rules");

        assertEquals(commandHandler.rules_text, commandHandler.handle(req).getBody());
    }
}