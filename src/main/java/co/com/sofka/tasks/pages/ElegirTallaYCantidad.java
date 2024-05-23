package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.PageAlpha.*;

public class ElegirTallaYCantidad implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_TALLA),
                Click.on(CAMPO_CANTIDAD)

        );
    }

    public static ElegirTallaYCantidad elegirTallaYCantidad() {
        return new ElegirTallaYCantidad();
    }
}
