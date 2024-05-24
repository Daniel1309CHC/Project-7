package co.com.sofka.stepdefinitions.setup;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetupPage {
    @Managed(driver = "chrome")
    protected WebDriver webDriver;

    private void setupActor(WebDriver webDriver, String actor) {
        OnStage.setTheStage(new OnlineCast());
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        chrome_options.addArguments("--no-sandbox");
        chrome_options.addArguments("--disable-dev-shm-usage");
        webDriver = new ChromeDriver(chrome_options);

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
