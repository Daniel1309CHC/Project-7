package co.com.sofka.questions;

import co.com.sofka.ui.PageFormularioEntregaYPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmacionCompra implements Question <String> {

    @Override
    public String answeredBy(Actor actor) {
        return PageFormularioEntregaYPago.MENSAJE_CONFIRMACION.resolveFor(actor).getText();

    }
    public static ConfirmacionCompra confirmacionCompra(){
        return new ConfirmacionCompra();
    }

}
