package ru.botgaydev.bot;

import java.util.HashMap;
import java.util.Map;

public class DeterminedCommands {
    public  Map<String, String> answers = new HashMap<>();


    public DeterminedCommands() {
        answers.put("/help", " Вся продукция в боте выставлена в ознакомительных целях и подзарумевает под собой " +
                "бесплатные позиции, выдаваемые в качестве поощрения за пожертвования. Любое использование какого-либо" +
                " продукта / услуги в боте, противоречащее законодательству РФ, запрещено!" + "\n" +
                "\n" +
                "Список команд" + "\n" +
                "/availability - товары в наличии" + "\n" +
                "/buy - категории к покупке" + "\n" +
                "/account - информация об аккаунте" + "\n" +
                "/ref_code - реферальный код" + "\n" +
                "/ref_list - список приглашенных людей" + "\n" +
                "/deposit - пополнение баланса" + "\n" +
                "" + "\n" +
                "Контакты" + "\n" +
                "Заведующий по заведующим: @m3f3w_1337" + "\n" +
                "Заведующий по заведению: @vladslav008"); // TODO дописать нормальную справку
        answers.put("/availability", "я должен показать, что есть в наличии");
        answers.put("/buy", "показываю категории доступные к покупке");
        //answers.put("/back", "возвращаю на шаг назад или в главное меню, потом решим");
        answers.put("/account", "инфо об акканте: ID, логин, счёт");
        answers.put("/ref_code", "реферальный код для приглашения новых пользователей");
        answers.put("/ref_list", "список рефералов");
        answers.put("/deposit", "пополнение баланса");
        //answers.put("/", "");
        // Далее по аналогии вбиваешь комманды для бота и ответы на них
        // Этот класс только для ДЕТЕРМЕНИРОВАННЫХ команд (имеют однозначный вызов и однозначный ответ.)
        // Для комманд с параметрами создадим отдельный класс по ходу дела. Щас нам бы пока с однозначными логику наладить
    }

    public Response handle(Request req) {
        //добавить логику
        Response response = new Response();
        response.body = answers.get(req.body);
        if (response.body == null){
            response.body = "Ya ne znau ety command";
        }
        return response;
    }

}
