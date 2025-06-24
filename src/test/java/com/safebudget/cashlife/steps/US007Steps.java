package com.safebudget.cashlife.steps;

import com.safebudget.cashlife.pages.EducationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US007Steps {
    // Escenario 1: Acceder a contenido educativo
    @Given("el usuario está en la sección de educación financiera")
    public void usuarioEnSeccionEducacionFinanciera() {
        System.out.println("Usuario entra a la sección de educación financiera");
        EducationPage.open();
    }

    @When("el usuario selecciona un tema educativo sobre {string}")
    public void seleccionarTemaEducativo(String tema) {
        System.out.println("Usuario selecciona el tema: " + tema);
        EducationPage.selectTopic(tema);
    }

    @Then("el sistema debe mostrar el contenido del tema educativo seleccionado")
    public void mostrarContenidoDelTema() {
        System.out.println("Sistema muestra el contenido del tema educativo");
        Assert.assertTrue(EducationPage.isTopicContentVisible());
    }

    // Escenario 2: Ver detalles de un tema específico
    @When("el usuario selecciona el tema {string}")
    public void seleccionarTemaDetalle(String temaDetalle) {
        System.out.println("Usuario selecciona detalle del tema: " + temaDetalle);
        EducationPage.selectTopicDetail(temaDetalle);
    }

    @Then("el sistema debe mostrar los detalles de ese tema")
    public void mostrarDetallesDelTema() {
        System.out.println("Sistema muestra los detalles del tema");
        Assert.assertTrue(EducationPage.isTopicDetailVisible());
    }

    // Escenario 3: Tema inexistente
    @Given("el usuario ha intentado acceder a un tema educativo con ID {string}")
    public void accederATemaInexistente(String id) {
        System.out.println("Usuario intenta acceder a tema con ID: " + id);
        EducationPage.accessInvalidTopicById(id);
    }

    @When("el sistema no encuentra el ID")
    public void sistemaNoEncuentraID() {
        System.out.println("Sistema no encuentra el ID del tema");
    }

    @Then("el sistema debe retornar un error indicando que el tema no existe")
    public void retornarErrorTemaNoExiste() {
        System.out.println("Sistema retorna error por tema inexistente");
        Assert.assertTrue(EducationPage.isErrorMessageDisplayed());
    }
}
