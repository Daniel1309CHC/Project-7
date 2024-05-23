package co.com.sofka.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@InicioDeSesion",
        features = {"src/test/resources/features/crear_cuenta.feature"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"co.com.sofka.stepdefinitions"}
)
public class Runner {
}
