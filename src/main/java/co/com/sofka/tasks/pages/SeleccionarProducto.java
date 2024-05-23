package co.com.sofka.tasks.pages;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.ui.PageAlpha.SELECCIONAR_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionarProducto implements Task {
    public static SeleccionarProducto enLaSeccion() {
        return instrumented(SeleccionarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SELECCIONAR_PRODUCTO, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECCIONAR_PRODUCTO)

        );
    }
}

