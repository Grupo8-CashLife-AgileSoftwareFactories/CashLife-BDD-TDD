package com.safebudget.cashlife.steps;

import com.safebudget.cashlife.pages.PlanesPage;
import com.safebudget.cashlife.pages.PlanesService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US011Steps {

    // Escenario 1: Crear plan financiero exitosamente
    @Given("el usuario ha accedido a la sección de planes")
    public void accederSeccionPlanes() {
        System.out.println("Usuario accede a la sección de planes financieros");
        PlanesPage.open();
    }

    @When("el usuario crea un nuevo plan financiero con los datos {string}, {string} y {string}")
    public void crearNuevoPlan(String nombrePlan, String montoObjetivo, String fechaLimite) {
        System.out.printf("Creando plan: %s - Objetivo: %s - Fecha límite: %s%n", nombrePlan, montoObjetivo, fechaLimite);
        PlanesService.crearPlan(nombrePlan, montoObjetivo, fechaLimite);
    }

    @Then("el sistema crea el plan con un ID único y muestra un mensaje de éxito")
    public void verificarCreacionPlan() {
        System.out.println("Sistema crea plan y muestra mensaje de éxito");
        Assert.assertTrue(PlanesPage.isSuccessMessageDisplayed());
    }

    // Escenario 2: Ver detalles del plan
    @Given("el usuario tiene un plan financiero previamente creado con el ID {string}")
    public void planPreviamenteCreado(String idPlan) {
        System.out.println("Usuario tiene un plan con ID: " + idPlan);
        PlanesService.verificarExistenciaPlan(idPlan);
    }

    @When("el usuario selecciona el plan con ID {string}")
    public void seleccionarPlan(String idPlan) {
        System.out.println("Usuario selecciona plan con ID: " + idPlan);
        PlanesPage.verDetallePlan(idPlan);
    }

    @Then("el sistema debe mostrar los detalles del plan seleccionado")
    public void mostrarDetallePlan() {
        System.out.println("Sistema muestra detalles del plan");
        Assert.assertTrue(PlanesPage.isPlanDetailVisible());
    }

    // Escenario 3: Error por datos inválidos
    @Given("el usuario se encuentra en la sección de crear plan")
    public void usuarioEnSeccionCrearPlan() {
        System.out.println("Usuario accede a crear nuevo plan");
        PlanesPage.openCreatePlan();
    }

    @When("el usuario intenta crear un plan con datos incompletos: {string}, {string}, {string}")
    public void crearPlanConDatosIncompletos(String nombrePlan, String monto, String fechaLimite) {
        System.out.printf("Intento con datos: %s - %s - %s%n", nombrePlan, monto, fechaLimite);
        PlanesService.intentarCrearPlan(nombrePlan, monto, fechaLimite);
    }

    @Then("el sistema debe retornar un error indicando los campos faltantes o incorrectos en el plan financiero")
    public void errorPorCamposInvalidos() {
        System.out.println("Sistema muestra error por datos inválidos en el plan financiero");
        Assert.assertTrue(PlanesPage.isErrorMessageDisplayed());
    }

}
