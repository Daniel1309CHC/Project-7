package co.com.sofka.questions;

import co.com.sofka.ui.PageLlenarFormulario;
import co.com.sofka.ui.PagePrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmacionLogueo implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PageLlenarFormulario.BTN_CREAR.resolveFor(actor).getText();

    }
    public static ConfirmacionLogueo confirmacionLogueo(){
        return new ConfirmacionLogueo();
    }
}
