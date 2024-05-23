package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.sofka.ui.PageFormularioEntregaYPago.MENSAJE_CONFIRMACION;

public class VerificarOrdenDeCompra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MENSAJE_CONFIRMACION, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );
    }
    public static VerificarOrdenDeCompra verificarOrdenDeCompra(){
        return new VerificarOrdenDeCompra();
    }

}
