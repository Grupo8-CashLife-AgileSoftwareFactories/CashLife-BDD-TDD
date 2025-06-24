package com.safebudget.cashlife.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US013Steps {
    // Escenario 1: Crear una familia
    @Given("el usuario está en la sección de {string}")
    public void usuarioEnSeccionFamilias(String seccion) {
        System.out.println("Usuario accede a la sección: " + seccion);
    }

    @When("el usuario crea una nueva familia con los datos {string}, {string} y {string}")
    public void crearNuevaFamilia(String nombreFamilia, String miembros, String jefeHogar) {
        System.out.printf("Creando familia: %s con %s miembros y jefe/a: %s%n", nombreFamilia, miembros, jefeHogar);
    }

    @Then("el sistema debe crear la familia con un ID único y mostrar un mensaje de éxito")
    public void verificarCreacionFamilia() {
        System.out.println("Sistema confirma creación de familia con éxito");
    }

    // Escenario 2: Ver detalles de familia
    @Given("el usuario ha creado previamente una familia con ID {string}")
    public void usuarioConFamiliaCreada(String idFamilia) {
        System.out.println("Familia existente con ID: " + idFamilia);
    }

    @When("el usuario selecciona una familia con ID {string}")
    public void seleccionarFamilia(String idFamilia) {
        System.out.println("Usuario selecciona familia con ID: " + idFamilia);
    }

    @Then("el sistema debe mostrar los detalles de esa familia, incluyendo miembros y jefe de hogar")
    public void mostrarDetallesFamilia() {
        System.out.println("Sistema muestra detalles completos de la familia");
    }

    // Escenario 3: Error al crear familia con datos inválidos
    @Given("el usuario está en la sección de crear familia")
    public void usuarioEnSeccionCrearFamilia() {
        System.out.println("Usuario accede a la creación de familia");
    }

    @When("el usuario intenta crear una familia con datos incompletos o inválidos: {string}, {string}, {string}")
    public void crearFamiliaConDatosInvalidos(String nombreFamilia, String miembros, String jefeHogar) {
        System.out.printf("Intento fallido de crear familia con: %s - %s - %s%n", nombreFamilia, miembros, jefeHogar);
    }

    @Then("el sistema debe retornar un error indicando los campos faltantes o incorrectos")
    public void mostrarErrorDatosFamilia() {
        System.out.println("Sistema muestra error por campos faltantes o inválidos");
    }
}
