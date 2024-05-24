package co.com.sofka.stepdefinitions;

import co.com.sofka.stepdefinitions.setup.SetupPage;
import co.com.sofka.tasks.pages.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.com.sofka.questions.ConfirmacionCompra.confirmacionCompra;
import static co.com.sofka.tasks.pages.AbrirPaginaInicial.abrirPagina;
import static co.com.sofka.tasks.pages.ElegirTallaYCantidad.elegirTallaYCantidad;
import static co.com.sofka.tasks.pages.LlenarFormularioEntregaYPago.llenarFormularioEntregaYPago;
import static co.com.sofka.tasks.pages.VerificarOrdenDeCompra.verificarOrdenDeCompra;
import static co.com.sofka.ui.PageFormularioEntregaYPago.MENSAJE_CONFIRMACION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static org.hamcrest.CoreMatchers.containsString;


public class ProcesoDeCompraStepDefinition extends SetupPage {


    @Dado("que el usuario se encuentra en la página de Bikinis Alpha")
    public void queElUsuarioSeEncuentraEnLaPáginaDeBikinisAlpha() {
        actorSetupTheBrowser("usuario");
        theActorCalled("usuario").wasAbleTo(
                abrirPagina().conLaUrl("https://bikinisalpha.co/")
        );
    }

    @Cuando("navega a la sección de {string}")
    public void navegaALaSecciónDe(String seccion) {
        theActorInTheSpotlight().attemptsTo(
                NavegarAlProducto.enLaSeccion(seccion));
    }

    @Cuando("selecciona los bikini para mujer eligiendo la talla con la cantidad deseada")
    public void seleccionaLosBikiniParaMujerEligiendoLaTallaConLaCantidadDeseada() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarProducto.enLaSeccion()
                //elegirTallaYCantidad()
                );
    }

    @Cuando("agrega el producto al carrito confirmando la compra")
    public void agregaElProductoAlCarritoConfirmandoLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.alCarrito(),
                VerCarrito.verCarrito(),
                PagarPedido.pagarPedido()
        );
    }


    @Cuando("llena el formulario de entrega y pago con el correo electronico {string} y el nombre {string}")
    public void llenaElFormularioDeEntregaYPagoConElCorreoElectronicoYElNombre(String correoElectronico, String nombre) {
        theActorInTheSpotlight().attemptsTo(
                llenarFormularioEntregaYPago(),
                verificarOrdenDeCompra()
        );
    }

    @Entonces("deberia visualizar un mensaje con la informacion de su orden")
    public void deberiaVisualizarUnMensajeConLaInformacionDeSuOrden() {
        String expectedMessage = String.format("Gracias por usar nuestro servicio");
        theActorInTheSpotlight().should(
                seeThat(confirmacionCompra(),containsString(expectedMessage))

        );
    }
}

