package co.com.sofka.stepdefinitions.servicesoap;


import co.com.sofka.questions.services.ResponseCode;
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


public class NumberToDollarStepDefinition extends SetupServiceSoap {

    @Given("que el usuario tiene acceso al servicio SOAP de conversión de números a palabras para dólares")
    public void queElUsuarioTieneAccesoAlServicioSOAPDeConversiónDeNúmerosAPalabrasParaDólares() {
        setupServiceSoap(URL_BASE_XML_SERVICE);
    }
    @When("el usuario envía una solicitud Post al servicio SOAP con el valor de {double}")
    public void elUsuarioEnvíaUnaSolicitudPostAlServicioSOAPConElValorDe(double number) {
        actor.attemptsTo(
                doPost()
                        .withTheResource(TO_WORD)
                        .andHeaders(headersSoap())
                        .andTheBody(getBodyToDolar(number))
        );

    }

    @Then("el código de respuesta de estado debería ser {int}")
    public void el_código_de_respuesta_de_estado_debería_ser(Integer codEstado) {
        actor.should(
                seeThat("The status code", ResponseCode.was(), equalTo(codEstado))
        );
    }

    @Then("en la respuesta debería contener {string}")
    public void enLaRespuestaDeberíaContener(String dollars) {
        String xmlString = actor.asksFor(responseSoap());

        Element rootElement = xmlToElements(xmlString);

        String result = getNumberToDollarsResult(rootElement);

        actor.should(
                seeThat(
                        actor -> result, equalTo(dollars)
                )
        );
    }

}
