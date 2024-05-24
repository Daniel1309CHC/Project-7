package co.com.sofka.stepdefinitions.servicesoap;


import co.com.sofka.stepdefinitions.servicerest.SetupService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jdom2.Element;


import static co.com.sofka.questions.services.ResponseSoap.responseSoap;
import static co.com.sofka.stepdefinitions.servicesoap.HeaderConfigurationSoap.headersSoap;
import static co.com.sofka.stepdefinitions.servicesoap.Paths.*;
import static co.com.sofka.taks.services.DoPost.doPost;
import static co.com.sofka.utils.CommonXML.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class NumberToWordStepDefinition extends SetupServiceSoap {
    @Given("que el usuario tiene acceso al servicio SOAP de conversión de números a palabras")
    public void que_el_usuario_tiene_acceso_al_servicio_soap_de_conversión_de_números_a_palabras() {
        setupServiceSoap(URL_BASE_XML_SERVICE);
    }
    @When("el usuario envía una solicitud post al servicio SOAP con el número {int}")
    public void el_usuario_envía_una_solicitud_soap_con_el_número(Integer number) {

        actor.attemptsTo(
                doPost()
                        .withTheResource(TO_WORD)
                        .andHeaders(headersSoap())
                        .andTheBody(getBodyToNumber(number))
        );
    }
    @Then("en la respuesta deberia contener {string}")
    public void en_la_respuesta_deberia_contener(String numberWord) {

        String xmlString = actor.asksFor(responseSoap());

        Element rootElement = xmlToElements(xmlString);

        String result = getNumberToWordsResult(rootElement);

        actor.should(
                seeThat(
                        actor -> result, equalTo(numberWord)
                )
        );

    }

}
