package co.com.sofka.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;


public class PageAlpha extends PageObject {

    public static final Target SECCION_COLLECCION = Target
            .the("Seccion coleccion bikinis para Mujer")
            .located(By.xpath("//*[@id=\"HeaderMenu-colecciones\"]"));


    public static final Target CAMPO_BIKINIS_ENTERIZO =  Target.the("Campo bikinis enterizos para Mujer")
            .located(By.xpath("//*[@id=\"HeaderMenu-colecciones-enteros\"]"));

    public static final Target SELECCIONAR_PRODUCTO =  Target.the("Bikinis para Mujer")
            .located(By.xpath("//*[@id=\"CardLink-template--16348035842207__product-grid-9134723760287\"]"));


    public static final Target CAMPO_TALLA = Target
            .the("Campo talla")
            .located(By.xpath("//*[@id=\"variant-radios-template--16348036038815__main\"]/fieldset/label[2]"));

    public static final Target CAMPO_CANTIDAD = Target
            .the("Campo cantidad")
            .located(By.xpath("//*[@id=\"Quantity-Form-template--16348036038815__main\"]/div[1]/quantity-input/button[2]"));

    public static final Target BOTON_AGREGAR_AL_CARRITO = Target
            .the("Botón agregar al carrito")
            .located(By.xpath("//*[@id=\"ProductSubmitButton-template--16348036038815__main\"]"));

//    public static final Target PAGAR_PEDIDO_BOTON = Target.the("Pagar pedido botón")
//            .locatedBy("//*[@id=\"cart-notification-form\"]/button");

    public static final Target BOTON_VER_CARRITO = Target.the("Botón ver carrito")
            .located(By.xpath("//*[@id=\"cart-icon-bubble\"]/div"));

    public static final Target BOTON_PAGAR_PEDIDO = Target.the("Botón pagar pedido")
            .located(By.xpath("//*[@id=\"checkout\"]"));

}

