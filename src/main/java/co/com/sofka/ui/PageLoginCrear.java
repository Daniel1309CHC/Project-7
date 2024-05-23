package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageLoginCrear extends PageObject {
    public static Target CLICK_CREAR_CUENTA = Target.the("Click enlace crear cuenta").located(By.xpath("//a[@href='/account/register']"));


}
