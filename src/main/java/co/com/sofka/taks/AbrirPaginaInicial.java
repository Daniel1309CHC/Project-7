package co.com.sofka.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaInicial implements Task {
    private final String url;
    public AbrirPaginaInicial(String url){
        this.url=url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)

        );

    }
    public static AbrirPaginaInicial abrirUrl(String url){
        return new AbrirPaginaInicial(url);
    }
}
