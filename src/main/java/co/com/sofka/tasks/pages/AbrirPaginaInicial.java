package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaInicial implements Task {

    private String url;

    public AbrirPaginaInicial conLaUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }

    public static AbrirPaginaInicial abrirPagina() {
        return new AbrirPaginaInicial();
    }
}
