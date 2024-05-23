package co.com.sofka.stepdefinitions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUp {
    @Managed(driver = "edge")
    protected WebDriver webDriver;

    private void setUpActor(WebDriver webDriver){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Jorge").can(BrowseTheWeb.with(webDriver));

    }

    protected void actorSetUpTheBrowser(){
        setUpActor(webDriver);
        maximizar(webDriver);
    }

    protected void maximizar(WebDriver webDriver){
        webDriver.manage().window().maximize();
    }

}
