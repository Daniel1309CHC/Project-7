package co.com.sofka.questions.services;


import co.com.sofka.models.JsonResponseModel.songsearch.ResponseSong;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;


public class JsonResponseSongName implements Question<String> {

    public String answeredBy(Actor actor) {
        String jsonResponse = SerenityRest.lastResponse().getBody().asString();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            ResponseSong responseSong = objectMapper.readValue(jsonResponse, ResponseSong.class);
            return responseSong.getMessage().getBody().getTrack_list().get(0).getTrack().getTrack_name();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static JsonResponseSongName jsonResponseSongName(){
        return new JsonResponseSongName();
    }
}
