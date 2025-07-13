package com.safebudget.cashlife.steps;

import com.safebudget.cashlife.pages.ConsultasPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US012Steps {
    @Given("el usuario está en la sección de consultas {string}")
    public void usuarioEnSeccionConsultas(String seccion) {
        System.out.println("Usuario navega a la sección de consultas: " + seccion);
        ConsultasPage.openSection(seccion);
    }

    @When("el usuario realiza una consulta de {string}")
    public void realizarConsulta(String tipoConsulta) {
        System.out.println("Usuario realiza consulta de: " + tipoConsulta);
        ConsultasPage.performQuery(tipoConsulta);
    }

    @Then("el sistema mostrará los resultados de la consulta")
    public void mostrarResultadosConsulta() {
        System.out.println("Sistema muestra resultados de la consulta");
        Assert.assertTrue(ConsultasPage.isResultsVisible());
    }
}
