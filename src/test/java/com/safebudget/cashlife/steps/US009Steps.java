package com.safebudget.cashlife.steps;

import com.safebudget.cashlife.pages.ReportePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US009Steps {
    @Given("el usuario está en la sección de reportes {string}")
    public void usuarioEnSeccionReporte(String seccion) {
        System.out.println("Usuario navega a la sección de reportes: " + seccion);
        ReportePage.openSection(seccion);
    }

    @When("el usuario genera un reporte de {string}")
    public void generarReporte(String tipoReporte) {
        System.out.println("Usuario genera reporte de: " + tipoReporte);
        ReportePage.generateReport(tipoReporte);
    }

    @Then("el sistema mostrará los resultados del reporte")
    public void mostrarResultadosReporte() {
        System.out.println("Sistema muestra resultados del reporte");
        Assert.assertTrue(ReportePage.isResultsVisible());
    }
}
