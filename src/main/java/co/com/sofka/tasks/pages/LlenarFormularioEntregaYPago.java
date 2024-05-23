package co.com.sofka.tasks.pages;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sofka.ui.PageFormularioEntregaYPago.*;
import static co.com.sofka.utils.Constants.*;


public class LlenarFormularioEntregaYPago implements Task {

    private String correoElectronico;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String cedula;
    private String casaApartamento;
    private String ciudad;
    private String provincia;
    private String codigoPostal;
    private String telefono;

    public LlenarFormularioEntregaYPago conElCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
        return this;
    }

    public LlenarFormularioEntregaYPago conElNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public LlenarFormularioEntregaYPago conLosApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public LlenarFormularioEntregaYPago conLaDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public LlenarFormularioEntregaYPago conLaCedula (String cedula) {
        this.cedula = cedula;
        return this;
    }

    public LlenarFormularioEntregaYPago conCasaApartamento(String casaApartamento) {
        this.casaApartamento = casaApartamento;
        return this;
    }

    public LlenarFormularioEntregaYPago conLaCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public LlenarFormularioEntregaYPago conElCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
        return this;
    }

    public LlenarFormularioEntregaYPago conElTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(CORREO_ELECTRONICO).into(CAMPO_CORREO_ELECTRONICO),
                Enter.theValue(INGRESAR_NOMBRE).into(CAMPO_NOMBRE),
                Enter.theValue(INGRESAR_APELLIDOS).into(CAMPO_APELLIDOS),
                Enter.theValue(INGRESAR_CEDULA).into(CAMPO_CEDULA),
                Enter.theValue(INGRESAR_DIRECCION).into(CAMPO_DIRECCION),
                Enter.theValue(INGRESAR_CASA_APARTAMENTO).into(CAMPO_CASA_APARTAMENTO),
                Enter.theValue(INGRESAR_CIUDAD).into(CAMPO_CIUDAD),
                Enter.theValue(INGRESAR_CODIGO_POSTAL).into(CAMPO_CODIGO_POSTAL),
                Enter.theValue(INGRESAR_TELEFONO).into(CAMPO_TELEFONO),
                Click.on(CAMPO_SELECCIONAR_PAGO),
                Click.on(CAMPO_SELECIONAR_DIRECCION_DE_FACTURACION),
                Click.on(BOTON_PAGAR_AHORA),
                Click.on(SELECCIONA_METODO_DE_PAGO),
                Click.on(CAMPO_TERMINOS_Y_CONDICIONES),
                Click.on(GENERAR_ORDEN_DE_PAGO)

        );
    }

    public static LlenarFormularioEntregaYPago llenarFormularioEntregaYPago() {
        return new LlenarFormularioEntregaYPago();
    }

}
