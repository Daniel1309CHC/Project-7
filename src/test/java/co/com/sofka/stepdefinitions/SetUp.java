package co.com.sofka.stepdefinitions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUp {
    @Managed(driver = "chrome")
    protected WebDriver webDriver;

    private void setUpActor(WebDriver webDriver){
        OnStage.setTheStage(new OnlineCast());


        theActorCalled("Jorge").can(BrowseTheWeb.with(webDriver));

    }

    protected void actorSetUpTheBrowser(){

        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        chrome_options.addArguments("--no-sandbox");
        chrome_options.addArguments("--disable-dev-shm-usage");
        webDriver = new ChromeDriver(chrome_options);
        setUpActor(webDriver);
        maximizar(webDriver);
    }

    protected void maximizar(WebDriver webDriver){
        webDriver.manage().window().maximize();
    }

}
