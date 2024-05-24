package co.com.sofka.stepdefinitions.servicerest;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.HashMap;

public class SetupService {

    protected final Actor actor = new Actor("Juanos");

    protected void setUpService(String urlBase){
        actor.can(CallAnApi.at(urlBase));
    }

    protected HashMap<String, Object> headers(){
        HashMap<String, Object> headersCollection = new HashMap<>();
        headersCollection.put("Content-Type","text/xml;charset=UTF-8");
        return headersCollection;
    }

}
