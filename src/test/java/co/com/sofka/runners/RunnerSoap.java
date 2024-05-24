package co.com.sofka.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@soap",
        features = {"src/test/resources/features/servicessoap"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"co.com.sofka.stepdefinitions.servicesoap"}
)
public class RunnerSoap {
}
