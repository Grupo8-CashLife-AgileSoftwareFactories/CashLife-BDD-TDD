package com.safebudget.cashlife.steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistroJefeHogarSteps {

    @Given("el Jefe de Hogar {string} se encuentra en la sección de registro")
    public void el_jefe_de_hogar_se_encuentra_en_la_sección_de_registro(String tipo) {
        System.out.println("Jefe de Hogar en registro: " + tipo);
    }

    @When("el Jefe de Hogar {string} rellene todos los datos correctamente con usuario {string} y contraseña {string}")
    public void el_jefe_de_hogar_rellene_todos_los_datos_correctamente_con_usuario_y_contraseña(String tipo, String usuario, String contrasena) {
        System.out.println("Jefe de Hogar: " + tipo + ", Usuario: " + usuario + ", Contraseña: " + contrasena);
    }
}