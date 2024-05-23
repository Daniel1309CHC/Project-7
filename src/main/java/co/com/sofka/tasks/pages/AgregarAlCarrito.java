package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.PageAlpha.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarAlCarrito implements Task {



    public static AgregarAlCarrito alCarrito() {
        return instrumented(AgregarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_AGREGAR_AL_CARRITO)

        );
    }
}