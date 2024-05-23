package co.com.sofka.ui;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PageConfirmacion {
    public static Question<Boolean> elementIsVisible(Target target) {
        return actor -> {
            WebDriverWait wait = new WebDriverWait(
                    actor.usingAbilityTo(BrowseTheWeb.class).getDriver(),
                    Duration.ofSeconds(5000)
            );
            try {
                wait.until(ExpectedConditions.visibilityOf(target.resolveFor(actor)));
                return target.resolveFor(actor).isDisplayed();
            } catch (Exception e) {
                return false;
            }
        };
    }
}