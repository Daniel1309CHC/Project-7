package co.com.sofka.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;

public class util {

    public static void bodyOfTheResponse(Actor actor) {
        System.out.println("cuerpo de la respuesta");
        String nuevo = new String(LastResponse.received().answeredBy(actor).asByteArray(), StandardCharsets.UTF_8);
        System.out.println(nuevo);
    }

    public static Map<String, Object> extractInfoFromJson(Actor actor, String jsonPathKey) {
        String responseBody = new String(LastResponse.received().answeredBy(actor).asByteArray(), StandardCharsets.UTF_8);
        return JsonPath.read(responseBody, jsonPathKey);
    }
}
