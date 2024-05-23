package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.ui.PageAlpha.BOTON_PAGAR_PEDIDO;


public class PagarPedido implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_PAGAR_PEDIDO));
    }

    public static PagarPedido pagarPedido() {
        return new PagarPedido();
    }
}
