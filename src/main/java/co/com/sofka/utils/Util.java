package co.com.sofka.utils;

import co.com.sofka.models.FormularioUserCrear;
import net.datafaker.Faker;

import java.util.Locale;

public class Util {

    public static FormularioUserCrear generarFormularioPersona() {
        // Establecer la localidad en español latino
        Locale locale = new Locale("es", "MX");
        Faker faker = new Faker(locale);

        // Crear una instancia de PersonaFormModel
        FormularioUserCrear personaForm = new FormularioUserCrear();

        // Establecer los datos mediante setters con valores generados directamente por Faker
        personaForm.setCorreo(faker.internet().emailAddress());
        personaForm.setNombre(faker.name().firstName());
        personaForm.setApellido(faker.name().lastName());
        personaForm.setContrasena(faker.internet().password());


//        personaForm.setCedula("1" + faker.number().digits(9));
//        personaForm.setMovil("3" + faker.number().digits(9));
//        personaForm.setCiudad("Medellín");
//        personaForm.setDepartamento("Antioquia");

//        personaForm.setNumeroDireccion(numerosAleatorios);
//        personaForm.setTipoVia("Calle");

        return personaForm;
    }
}