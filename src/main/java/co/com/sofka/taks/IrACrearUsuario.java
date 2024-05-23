package co.com.sofka.taks;

import co.com.sofka.ui.PagePrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrACrearUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PagePrincipal.BTN_INICIO_SESION)
        );

    }
    public static IrACrearUsuario irACrearUsuario() {
        return new IrACrearUsuario();
    }



}
