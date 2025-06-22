package com.safebudget.cashlife.steps;

import com.safebudget.cashlife.pages.InflationReportPage;
import com.safebudget.cashlife.services.InflationReportService;
import com.safebudget.cashlife.pages.UserProfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US008Steps {
    // Escenario 1: Ver reporte personalizado
    @Given("el usuario tiene un perfil activo y ha registrado sus gastos durante el año {string}")
    public void usuarioConGastosRegistradosEnAno(String año) {
        System.out.println("Usuario con gastos registrados en el año: " + año);
        UserProfile.loadGastosParaAno(año);
    }

    @When("el usuario accede a su reporte de inflación")
    public void accederReporteInflacion() {
        System.out.println("Usuario accede al reporte de inflación");
        InflationReportService.generarReporte();
    }

    @Then("el sistema muestra un gráfico del impacto de la inflación en su capacidad de ahorro")
    public void mostrarGraficoInflacionPersonal() {
        System.out.println("Se muestra el gráfico personalizado de inflación");
        Assert.assertTrue(InflationReportPage.isChartVisible());
    }

    // Escenario 2: Comparar con promedio nacional
    @Given("el usuario tiene su reporte de inflación actualizado para el año {string}")
    public void usuarioConReporteActualizado(String año) {
        System.out.println("Reporte actualizado para el año: " + año);
        InflationReportService.verificarDatosActualizados(año);
    }

    @When("el usuario selecciona la opción de comparar su inflación con la nacional")
    public void compararConNacional() {
        System.out.println("Usuario selecciona comparar con promedio nacional");
        InflationReportPage.compararConPromedioNacional();
    }

    @Then("el sistema muestra una comparación gráfica entre su inflación personal y la inflación promedio nacional")
    public void mostrarComparacionConNacional() {
        System.out.println("Sistema muestra comparación gráfica con datos nacionales");
        Assert.assertTrue(InflationReportPage.isComparisonChartDisplayed());
    }

    // Escenario 3: Error por falta de datos
    @Given("el usuario tiene un ID válido {string} pero no tiene datos registrados de inflación")
    public void usuarioSinDatosInflacion(String idUsuario) {
        System.out.println("Usuario con ID válido pero sin datos: " + idUsuario);
        UserProfile.loadWithoutInflationData(idUsuario);
    }

    @When("el sistema intenta obtener el reporte de inflación")
    public void intentarObtenerReporteVacio() {
        System.out.println("Sistema intenta generar reporte sin datos");
        InflationReportService.generarReporte();
    }

    @Then("el sistema debe retornar un error indicando que no se tiene información suficiente")
    public void mostrarErrorSinDatos() {
        System.out.println("Sistema muestra error por falta de información");
        Assert.assertTrue(InflationReportPage.isNoDataErrorDisplayed());
    }

}
