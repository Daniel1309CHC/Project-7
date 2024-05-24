package co.com.sofka.stepdefinitions.servicerest;

import co.com.sofka.questions.services.ResponseCode;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.Map;

import static co.com.sofka.questions.services.JsonResponseName.jsonResponseName;
import static co.com.sofka.stepdefinitions.servicerest.Constants.*;
import static co.com.sofka.utils.utilService.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ArtistByNameSD extends SetupService{

    @Given("the user is in the web page musixmatch")
    public void theUserIsInTheWebPageMusixmatch() {
        setUpService(ROOT_URL_MUSIXMATCH);
    }

    @When("sent a GET petition to the resource {string} with the artist name {string}")
    public void sentAGETPetitionToTheResourceWithTheArtistName(String resource, String artistName) {
        actor.attemptsTo(
                Get.resource(resource).with(request->
                        request.queryParam(PARAM_NAME_ARTIST, artistName)
                                .queryParam(PARAM_API_KEY, MM_RS)
                )
        );
    }

    @Then("it should obtain a answer code {int}")
    public void itShouldObtainAAnswerCode(Integer statusCode) {
        actor.should(
                seeThat(UTIL_ANSWER_CODE,
                        ResponseCode.was(), equalTo(statusCode))
        );

    }

    @Then("it should be able to see the information of the first artist found by the name {string}")
    public void itShouldBeAbleToSeeTheInformationOfTheFirstArtistFoundByTheName(String artistName) {
        System.out.println(UTIL_BAR);
        Map<String, Object> artistInfo = extractInfoFromJson(actor, PATH_KEY_ARTIST_NAME);
        artistInfo.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println(UTIL_BAR);

        actor.should(
                seeThat(jsonResponseName(), is(equalTo(artistName)))
        );
    }
}
