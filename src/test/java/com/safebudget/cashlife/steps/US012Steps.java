package com.safebudget.cashlife.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US012Steps {
    // Escenario 1: Enviar consulta correctamente
    @Given("el usuario está en la sección de {string}")
    public void usuarioEnSeccionConsultas(String seccion) {
        System.out.println("Usuario entra en la sección: " + seccion);
        // ConsultasPage.open(seccion);
    }

    @When("el usuario ingresa su consulta {string} en el campo {string} y selecciona {string}")
    public void ingresarConsultaYEnviar(String mensaje, String campo, String boton) {
        System.out.printf("Usuario escribe: \"%s\" en %s y presiona %s%n", mensaje, campo, boton);
        // ConsultasPage.writeMessage(mensaje);
        // ConsultasPage.clickButton(boton);
    }

    @Then("el sistema confirmará que la consulta fue recibida")
    public void confirmarRecepcionConsulta() {
        System.out.println("Sistema confirma que la consulta fue recibida");
    }

    @And("mostrará el mensaje {string}")
    public void mostrarMensajeExito(String mensaje) {
        System.out.println("Sistema muestra mensaje: " + mensaje);
    }

    // Escenario 2: Error por campo vacío
    @When("el usuario deja el campo {string} vacío o ingresa {string}")
    public void dejarCampoVacio(String campo, String mensaje) {
        System.out.printf("Campo %s está vacío o contiene: \"%s\"%n", campo, mensaje);
    }

    @Then("el sistema mostrará el mensaje {string}")
    public void mostrarMensajeError(String mensaje) {
        System.out.println("Sistema muestra mensaje de error: " + mensaje);
    }
}
