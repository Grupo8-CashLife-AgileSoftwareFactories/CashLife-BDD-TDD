package com.safebudget.cashlife.steps;

import com.safebudget.cashlife.services.NotificationService;
import com.safebudget.cashlife.pages.TransactionService;
import com.safebudget.cashlife.pages.UserProfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US004Steps {
    @Given("el usuario ha configurado un umbral de gastos de {int} en su perfil")
    public void configurarUmbral(int umbral) {
        System.out.println("Usuario configuró un umbral de: " + umbral);
        UserProfile.setSpendingThreshold(umbral);
    }

    @When("el usuario realiza una transacción de {int} que supera ese umbral")
    public void realizarTransaccion(int monto) {
        System.out.println("Usuario realiza una transacción de: " + monto);
        TransactionService.makeTransaction(monto);
    }

    @Then("el sistema enviará una notificación indicando {string}")
    public void verificarNotificacion(String mensajeEsperado) {
        System.out.println("Verificando notificación: " + mensajeEsperado);
        Assert.assertEquals(mensajeEsperado, NotificationService.getLastNotificationMessage());
    }
}
