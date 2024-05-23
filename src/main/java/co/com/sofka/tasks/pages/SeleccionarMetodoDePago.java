package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.ui.PageFormularioEntregaYPago.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class SeleccionarMetodoDePago implements Task {
    public static SeleccionarProducto enLaSeccion() {
        return instrumented(SeleccionarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SELECCIONA_METODO_DE_PAGO, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECCIONA_METODO_DE_PAGO)

        );
    }
}
