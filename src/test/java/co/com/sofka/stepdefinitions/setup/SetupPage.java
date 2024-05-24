package co.com.sofka.stepdefinitions.setup;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetupPage {
    @Managed(driver = "edge")
    protected WebDriver webDriver;

    private void setupActor(WebDriver webDriver, String actor) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(actor).can(BrowseTheWeb.with(webDriver));
    }

    private static void maximizar(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    protected void actorSetupTheBrowser(String actor) {
        setupActor(webDriver, actor);
        maximizar(webDriver);
    }
}
