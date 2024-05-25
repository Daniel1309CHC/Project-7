package co.com.sofka.stepdefinitions;

import co.com.sofka.models.FormularioUserCrear;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.ConfirmacionLogueo.confirmacionLogueo;
import static co.com.sofka.taks.AbrirPaginaInicial.abrirUrl;
import static co.com.sofka.taks.IrACrearUsuario.irACrearUsuario;
import static co.com.sofka.taks.LlenarFormularioRegistro.llenarFormularioRegistro;
import static co.com.sofka.taks.SeleccionarCrearCuenta.seleccionarCrearCuenta;
import static co.com.sofka.utils.Util.generarFormularioPersona;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class CrearCuentaSD extends SetUp{
    @Given("que el usuario está en la página de inicio de alpha")
    public void queElUsuarioEstáEnLaPáginaDeInicioDeAlpha() {


        actorSetUpTheBrowser();
        theActorInTheSpotlight().wasAbleTo(
                abrirUrl("https://bikinisalpha.co/")
        );


    }
    @When("el usuario selecciona crear cuenta")
    public void elUsuarioSeleccionaCrearCuenta() {
        theActorInTheSpotlight().attemptsTo(
                irACrearUsuario(),
                seleccionarCrearCuenta()
        );



    }
    @When("el usuario ingresa datos de registro válidos")
    public void elUsuarioIngresaDatosDeRegistroVálidos() {
        FormularioUserCrear formularioUserCrear =  generarFormularioPersona();
        theActorInTheSpotlight().attemptsTo(
                llenarFormularioRegistro().withTheCredentiasl(formularioUserCrear)

        );



    }


    @Then("el usuario debería ver un mensaje de confirmación")
    public void elUsuarioDeberíaVerUnMensajeDeConfirmación() {



        String expectedMessage = String.format("Crear");
        theActorInTheSpotlight().should(
                seeThat(confirmacionLogueo(),containsString(expectedMessage))
        );




    }

}
