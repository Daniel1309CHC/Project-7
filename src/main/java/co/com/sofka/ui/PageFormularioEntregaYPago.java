package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PageFormularioEntregaYPago extends PageObject {

    public static final Target CAMPO_CORREO_ELECTRONICO = Target
            .the("Campo correo electronico")
            .located(By.xpath("//*[@id=\"email\"]"));

    public static final Target CAMPO_NOMBRE =  Target
            .the("Campo nombre")
            .located(By.xpath("(//*[@name=\"firstName\"])[1]"));

    public static final Target CAMPO_APELLIDOS = Target
            .the("Campo apellidos")
            .located(By.xpath("(//*[@name=\"lastName\"])[1]"));


    public static final Target CAMPO_CEDULA = Target
            .the("Campo cedula")
            .located(By.xpath("(//*[@name=\"company\"])[1]"));


    public static final Target CAMPO_DIRECCION = Target
            .the("Campo direccion")
            .located(By.xpath("(//*[@name=\"address1\"])[1]"));


    public static final Target CAMPO_CASA_APARTAMENTO = Target
            .the("Campo casa o apartamento")
            .located(By.xpath("(//*[@name=\"address2\"])[1]"));

    public static final Target CAMPO_CIUDAD = Target
            .the("Campo ciudad")
            .located(By.xpath("(//*[@name=\"city\"])[1]"));

    public static final Target CAMPO_PROVINCIA = Target
            .the("Campo provincia") //CUIDADO
            .located(By.xpath("//*[@id=\"Select1\"]/option[2]"));

    public static final Target CAMPO_CODIGO_POSTAL = Target
            .the("Campo codigo postal")
            .located(By.xpath("(//*[@name=\"postalCode\"])[1]"));

    public static final Target CAMPO_TELEFONO = Target
            .the("Campo telefono")
            .located(By.xpath("(//*[@name=\"phone\"])[1]"));

    public static final Target CAMPO_SELECCIONAR_PAGO = Target
            .the("Campo seleccionar pago")
            .located(By.xpath("(//*[@name=\"basic\"])[2]"));

    public static final Target CAMPO_SELECIONAR_DIRECCION_DE_FACTURACION = Target
            .the("Campo direccion de facturacion")
            .located(By.xpath("(//*[@name=\"billing_address_selector\"])[1]"));

    public static final Target BOTON_PAGAR_AHORA = Target
            .the("Botón pagar ahora")
            .located(By.xpath("( //*[@id=\"checkout-pay-button\"])"));

    public static final Target SELECCIONA_METODO_DE_PAGO = Target
            .the("Seleccionar metodo de pago")
            .located(By.xpath("//*[@id=\"pm-EFECTY\"]"));


    public static final Target GENERAR_ORDEN_DE_PAGO = Target
            .the("Generar orden de pago")
            .located(By.xpath("//span[@translate='pm.cash.button.pay' and @class='ng-scope']"));


    public static final Target CAMPO_TERMINOS_Y_CONDICIONES = Target
            .the("Aceptar terminos y condiciones")
            .located(By.xpath("//*[@id=\"tandc\"]"));


    public static final Target MENSAJE_CONFIRMACION = Target
            .the("Mensaje de confirmacion")
            .located(By.xpath("//*[@id=\"panel-cash-page\"]/div[1]/p"));
}
