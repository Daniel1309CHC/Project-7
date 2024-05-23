package co.com.sofka.taks;

import co.com.sofka.ui.PageLoginCrear;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;

public class SeleccionarCrearCuenta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(PageLoginCrear.CLICK_CREAR_CUENTA),
                                WebElementStateMatchers.isVisible()).
                        forNoMoreThan(Duration.ofSeconds(10)),

                Click.on(PageLoginCrear.CLICK_CREAR_CUENTA)
        );

    }
    public static SeleccionarCrearCuenta seleccionarCrearCuenta() {
        return new SeleccionarCrearCuenta();
    }


}
