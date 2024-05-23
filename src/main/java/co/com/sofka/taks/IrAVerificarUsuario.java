package co.com.sofka.taks;

import co.com.sofka.ui.PageLoginCrear;
import co.com.sofka.ui.PagePrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;

public class IrAVerificarUsuario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PagePrincipal.BTN_VOLVER_PERFIL),
                Wait.until(WebElementQuestion.the(PagePrincipal.BTN_CERRAR_SESION),
                                WebElementStateMatchers.isVisible()).
                        forNoMoreThan(Duration.ofSeconds(10))

        );

    }
    public static IrAVerificarUsuario irAVerificarUsuario(){
        return new IrAVerificarUsuario();
    }
}
