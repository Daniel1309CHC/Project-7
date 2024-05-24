package co.com.sofka.taks;

import co.com.sofka.models.FormularioUserCrear;
import co.com.sofka.ui.PageLlenarFormulario;
import co.com.sofka.ui.PagePrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import static co.com.sofka.ui.PageLlenarFormulario.*;

public class LlenarFormularioRegistro implements Task {
    private FormularioUserCrear formularioUserCrear;


    public LlenarFormularioRegistro withTheCredentiasl(FormularioUserCrear formularioUserCrear){
        this.formularioUserCrear = formularioUserCrear;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(NOMBRE),
                Enter.theValue(formularioUserCrear.getNombre()).into(NOMBRE),
                Enter.theValue(formularioUserCrear.getApellido()).into(APELLIDO),
                Enter.theValue(formularioUserCrear.getCorreo()).into(CORREO),
                Enter.theValue(formularioUserCrear.getContrasena()).into(CONTRASENA),

                Wait.until(WebElementQuestion.the(PageLlenarFormulario.BTN_CREAR),
                        WebElementStateMatchers.isVisible())

        );

    }
    public static LlenarFormularioRegistro llenarFormularioRegistro(){
        return new LlenarFormularioRegistro();
    }



}
