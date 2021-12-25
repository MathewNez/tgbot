package ru.botgaydev.bot;

import java.util.*;

import ru.botgaydev.bot.entity.Good;
import ru.botgaydev.bot.service.GoodService;

public class DeterminedCommands {
    public  Map<String, String> answers = new HashMap<>();
    GoodService goodService = new GoodService();


    public DeterminedCommands() {
        answers.put("/help", "Вся продукция в боте выставлена в ознакомительных целях и подзарумевает под собой " +
                "бесплатные позиции, выдаваемые в качестве поощрения за пожертвования. Любое использование какого-либо " +
                "продукта / услуги в боте, противоречащее законодательству РФ, запрещено!\n" +
                "\n" +
                "Список команд\n" +
                "/availability - товары в наличии\n" +
//                "/buy - купить товар\n" +
//                "/deposit - пополнение баланса\n" +
//                "/find - поиск товара\n" +
//                "/account - информация об аккаунте\n" +
//                "/ref_code - реферальный код\n" +
//                "/ref_list - список приглашенных людей\n" +
                "/rules - правила\n" +
                "\n" +
                "Контакты\n" +
                "Заведующий по заведующим: @m3f3w_1337\n" +
                "Заведующий по заведению: @vladslav008");
//        answers.put("/availability", "я должен показать, что есть в наличии");
//        answers.put("/buy", "показываю категории доступные к покупке");
//        answers.put("/deposit", "пополнение баланса");
//        answers.put("/find", "выполняю поиск по заголовкам");
        //answers.put("/back", "возвращаю на шаг назад или в главное меню, потом решим");
        answers.put("/account", "инфо об акканте: ID, логин, счёт");
//        answers.put("/ref_code", "реферальный код для приглашения новых пользователей");
//        answers.put("/ref_list", "список рефералов");
        answers.put("/rules", rules_text);
    }

    public String rules_text = "1. Возврат денежных средств осуществляется только на баланс бота.\n" +
            "2. Вывод денежных средств с баланса бота не осуществляется.\n" +
            "3. Заявка на возврат за любой электронный товар принимается только при наличии записи с экрана с момента покупки\n" +
            "4. Администрация оставляет за собой право вносить любые изменения и дополнения в правила, без предупреждения.\n" +
            "5. В случае возникновения проблем покупатель должен незамедлительно написать в поддержку.\n" +
            "6. Ответ администрации может занимать до месяца, в среднем - не дольше пары часов.\n" +
            "7. Если покупка по правилам может быть возвращена, вместе с товаром будет выдан контакт поддержки, " +
            "соответствующей проданному товару.\n" +
            "8. Администрация оставляет за собой право заблокировать любого пользователя, без возмещения средств на балансе.\n";

    public Response handle(Request req) {
        Response response = new Response();
        String responseBody = null;
        switch (req.getBody()) {
            case ("/availability"):
                List<Good> goodsArr = goodService.findAll();
                List<String> rows = new ArrayList<>();
                for(Good good : goodsArr) {
                    String row = String.format("ID %s | %s | %s руб | Остаток: %s",
                            good.getId(), good.getDescr(), good.getPrice(), good.getLeft());
                    rows.add(row);
                    responseBody = String.join("\n", rows);
                }
                break;
            case ("/buy"):
                break;
            case ("/account"):
                break;
            default:
                responseBody = answers.get(req.getBody());

        }
        response.setBody(responseBody);
        if (response.getBody() == null){
            response.setBody("Unknown command. Please, see \"/help\" for list of available commands.");
        }
        return response;
    }

//    public boolean verify(Request req) {
////        if (req.getBody() in answers.getKeys())
////            return true;
//        return false;
//    }

}
