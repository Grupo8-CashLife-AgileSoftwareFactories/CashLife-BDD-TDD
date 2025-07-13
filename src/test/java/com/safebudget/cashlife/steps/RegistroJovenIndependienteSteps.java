package com.safebudget.cashlife.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RegistroJovenIndependienteSteps {

    @Given("el joven independiente {string} se encuentra en la sección de registro")
    public void el_joven_independiente_se_encuentra_en_la_sección_de_registro(String tipo) {
        System.out.println("Joven independiente en registro: " + tipo);
    }

    @When("el joven independiente {string} completa todos los campos correctamente con usuario {string} y contraseña {string}")
    public void el_joven_independiente_completa_todos_los_campos_correctamente_con_usuario_y_contraseña(String tipo, String usuario, String contrasena) {
        System.out.println("Joven independiente: " + tipo + ", Usuario: " + usuario + ", Contraseña: " + contrasena);
    }

    @Then("el sistema almacenara los datos en la base de datos")
    public void el_sistema_almacenara_los_datos_en_la_base_de_datos() {
        System.out.println("Datos almacenados en la base de datos");
    }

    @Then("mostrara el mensaje {string}")
    public void mostrara_el_mensaje(String mensaje) {
        System.out.println("Mensaje mostrado: " + mensaje);
    }
}
