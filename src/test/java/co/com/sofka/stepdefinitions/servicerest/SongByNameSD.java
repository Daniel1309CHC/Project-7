package co.com.sofka.stepdefinitions.servicerest;

import co.com.sofka.models.JsonResponseModel.songsearch.SongArtistModel;
import co.com.sofka.questions.services.ResponseCode;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.List;
import java.util.Map;

import static co.com.sofka.questions.services.JsonResponseSongName.jsonResponseSongName;
import static co.com.sofka.stepdefinitions.servicerest.Constants.*;
import static co.com.sofka.utils.utilService.extractInfoFromJson;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;

public class SongByNameSD extends SetupService{

    @Given("the user is in the web page musixmatch in the track search module")
    public void theUserIsInTheWebPageMusixmatchInTheTrackSearchModule() {
        setUpService(ROOT_URL_MUSIXMATCH);

    }
    @When("sent a GET petition to the resource {string} with the song name and artist name")
    public void sentAGETPetitionToTheResourceWithTheSongNameAndArtistName(String resource, List<SongArtistModel> fecha ) {

        actor.attemptsTo(
                Get.resource(resource).with(request->
                        request.queryParam(PARAM_NAME_SONG, fecha.get(0).getSongName())
                                .queryParam(PARAM_NAME_ARTIST, fecha.get(0).getArtistName())
                                .queryParam(PARAM_API_KEY, MM_RS)
                )
        );
    }
    @Then("it should obtain an answer code {int}")
    public void itShouldObtainAnAnswerCode(Integer statusCode) {
        actor.should(
                seeThat(UTIL_ANSWER_CODE,
                        ResponseCode.was(), equalTo(statusCode))
        );
    }
    @Then("it should be able to see the information of the first song found by the name {string}")
    public void itShouldBeAbleToSeeTheInformationOfTheFirstSongFoundByTheName(String songName) {

        System.out.println("*******************************************");
        Map<String, Object> songInfo = extractInfoFromJson(actor, PATH_KEY_SONG_NAME);
        songInfo.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("*******************************************");

        actor.should(
                seeThat(jsonResponseSongName(), is(equalTo(songName)))
        );
    }
}
