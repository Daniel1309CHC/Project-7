package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageLlenarFormulario extends PageObject {
    public static Target NOMBRE = Target.
            the("Nombre de Formulario").located(By.xpath("//input[@id='RegisterForm-FirstName']"));
    public static Target APELLIDO = Target.
            the("Apellido de formulario").located(By.xpath("//input[@id='RegisterForm-LastName']"));
    public static Target CORREO = Target.
            the("Correo electronico de formulario").located(By.xpath("//input[@id='RegisterForm-email']"));
    public static Target CONTRASENA = Target.
            the("Contrasena de formulario").located(By.xpath("//input[@id='RegisterForm-password']"));
    public static Target BTN_CREAR = Target.
            the("Boton crear").located(By.xpath("//button[normalize-space(text())='Crear']"));


}
