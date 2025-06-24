package com.safebudget.cashlife.steps;

import com.safebudget.cashlife.pages.LoginPage;
import com.safebudget.cashlife.pages.DashBoardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US001Steps {
    @Given("el usuario se encuentra en la página de inicio de sesión")
    public void usuarioEnLogin() {
        System.out.println("Navegar a la página de inicio de sesión");
        LoginPage.openLoginPage();
    }

    @When("el usuario ingresa credenciales válidas")
    public void ingresarCredencialesValidas() {
        System.out.println("Ingresar usuario y contraseña válidos");
        LoginPage.enterCredentials("usuario", "contraseña");
        LoginPage.submit();
    }

    @Then("el sistema permite el acceso al sistema")
    public void accesoPermitido() {
        System.out.println("Validar redirección al dashboard");
        Assert.assertTrue(DashBoardPage.isDisplayed());
    }

    @When("el usuario ingresa credenciales inválidas")
    public void ingresarCredencialesInvalidas() {
        System.out.println("Ingresar usuario y contraseña inválidos");

    }

    @Then("el sistema muestra un mensaje de error de autenticación")
    public void mostrarMensajeError() {
        System.out.println("Verificar mensaje de error");
        Assert.assertTrue(LoginPage.isAuthErrorDisplayed());
    }
}
