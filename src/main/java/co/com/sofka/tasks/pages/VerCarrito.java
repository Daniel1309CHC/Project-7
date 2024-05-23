package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.PageAlpha.BOTON_VER_CARRITO;

public class VerCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_VER_CARRITO)
        );
    }

    public static VerCarrito verCarrito() {
        return new VerCarrito();
    }
}


