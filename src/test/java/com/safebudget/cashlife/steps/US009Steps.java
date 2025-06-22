package com.safebudget.cashlife.steps;

import com.safebudget.cashlife.pages.ReporteInflacionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US009Steps {
    // Escenario 1: Ver reporte de inflación anual
    @Given("el usuario está en la sección de {string}")
    public void usuarioEnSeccionReporte(String seccion) {
        System.out.println("Usuario navega a la sección: " + seccion);
        ReporteInflacionPage.openSection(seccion);
    }

    @When("el usuario selecciona {string} para el año {int}")
    public void seleccionarReporteAnual(String opcion, int año) {
        System.out.println("Usuario selecciona: " + opcion + " para el año: " + año);
        ReporteInflacionPage.selectOptionForYear(opcion, año);
    }

    @Then("el sistema mostrará el gráfico de inflación anual con los datos correspondientes")
    public void mostrarGraficoInflacionAnual() {
        System.out.println("Sistema muestra gráfico de inflación anual");
        Assert.assertTrue(ReporteInflacionPage.isAnnualChartVisible());
    }

    // Escenario 2: Comparar inflación con años anteriores
    @When("el usuario selecciona la opción {string} para el año {int}")
    public void seleccionarComparacionConAniosAnteriores(String opcion, int añoActual) {
        System.out.println("Usuario selecciona: " + opcion + " para el año: " + añoActual);
        ReporteInflacionPage.compareWithPreviousYears(añoActual);
    }

    @Then("el sistema mostrará una comparación visual de la inflación actual con los años anteriores")
    public void mostrarComparacionInflacion() {
        System.out.println("Sistema muestra comparación gráfica con años anteriores");
        Assert.assertTrue(ReporteInflacionPage.isComparisonChartVisible());
    }
}
