package co.com.sofka.questions.services;


import co.com.sofka.models.JsonResponseModel.artistsearch.ResponseArtist;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;


public class JsonResponseName implements Question<String> {

    public String answeredBy(Actor actor) {
        String jsonResponse = SerenityRest.lastResponse().getBody().asString();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            ResponseArtist response = objectMapper.readValue(jsonResponse, ResponseArtist.class);
            return response.getMessage().getBody().getArtist_list().get(0).getArtist().getArtist_name();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static JsonResponseName jsonResponseName(){
        return new JsonResponseName();
    }
}
