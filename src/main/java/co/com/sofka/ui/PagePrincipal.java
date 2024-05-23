package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagePrincipal extends PageObject {
    public static Target BTN_INICIO_SESION = Target.
            the("Ir a crear un inicio de sesion").located(By.xpath("//a[@href='/account/login' and .//span[text()='Iniciar sesión']]"));
    public static Target BTN_CERRAR_SESION = Target.
            the("Cerrar sesion").located(By.xpath("//a[@href='/account/logout']"));
    public static Target BTN_VOLVER_PERFIL = Target.
            the("Cerrar sesion").located(By.xpath("//a[@href='/account' and @class='header__icon header__icon--account link focus-inset small-hide' and .//span[text()='Cuenta']]"));
}
