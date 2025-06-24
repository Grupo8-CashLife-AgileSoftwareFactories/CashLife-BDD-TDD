package com.safebudget.cashlife.steps;

import com.safebudget.cashlife.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US002Steps {
    @Given("el usuario está en el formulario de registro")
    public void usuarioEnFormularioRegistro() {
        System.out.println("Usuario navega al formulario de registro");
        RegistrationPage.open();
    }

    @When("completa todos los campos obligatorios correctamente")
    public void completarCamposValidos() {
        System.out.println("Usuario llena todos los campos válidos");
        RegistrationPage.fillValidData();
    }

    @And("acepta los términos y condiciones")
    public void aceptarTerminos() {
        System.out.println("Usuario acepta términos y condiciones");
        RegistrationPage.acceptTerms();
    }

    @Then("el sistema crea una cuenta y muestra un mensaje de bienvenida")
    public void mostrarMensajeBienvenida() {
        System.out.println("Mostrar mensaje de bienvenida");
        Assert.assertTrue(RegistrationPage.isWelcomeMessageDisplayed());
    }

    @When("deja campos obligatorios vacíos")
    public void dejarCamposVacios() {
        System.out.println("Usuario no completa todos los campos");
        RegistrationPage.leaveFieldsEmpty();
    }

    @Then("el sistema muestra mensajes de error en los campos requeridos")
    public void mostrarErroresCampos() {
        System.out.println("Mostrar mensajes de error");
        Assert.assertTrue(RegistrationPage.areErrorsDisplayed());
    }
}
