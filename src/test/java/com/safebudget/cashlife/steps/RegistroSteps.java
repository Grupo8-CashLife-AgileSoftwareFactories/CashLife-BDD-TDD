package com.safebudget.cashlife.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RegistroSteps {

    @Given("el usuario ha completado el proceso de registro y tiene credenciales validas")
    public void el_usuario_ha_completado_el_proceso_de_registro_y_tiene_credenciales_validas() {
        System.out.println("Usuario registrado con credenciales válidas");
    }

    @When("el usuario selecciona el boton {string}")
    public void el_usuario_selecciona_el_boton(String boton) {
        System.out.println("Usuario selecciona el botón: " + boton);
    }

    @When("el usuario selecciona el boton {string} del foro e ingresa sus credenciales")
    public void el_usuario_selecciona_el_boton_del_foro_e_ingresa_sus_credenciales(String boton) {
        System.out.println("Usuario selecciona el botón del foro: " + boton + " e ingresa credenciales");
    }

    @When("el usuario completa la infomacion del usuario. Usuario: {string} Contraseña: {string}")
    public void el_usuario_completa_la_infomacion_del_usuario_usuario_contraseña(String usuario, String contrasena) {
        System.out.println("Usuario: " + usuario + ", Contraseña: " + contrasena);
    }

    @When("selecciona el boton {string}")
    public void selecciona_el_boton(String boton) {
        System.out.println("Selecciona el botón: " + boton);
    }

    @Then("el sistema le asignara una sesion de usuario")
    public void el_sistema_le_asignara_una_sesion_de_usuario() {
        System.out.println("Sistema asigna sesión de usuario");
    }
}
