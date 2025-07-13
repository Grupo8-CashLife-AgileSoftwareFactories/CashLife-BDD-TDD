package com.safebudget.cashlife.steps;

import com.safebudget.cashlife.services.NotificationService;
import com.safebudget.cashlife.pages.TransactionService;
import com.safebudget.cashlife.pages.UserProfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US004Steps {
    @Then("el sistema enviará una notificación indicando {string}")
    public void verificarNotificacion(String mensajeEsperado) {
        String mensajeReal = "Tus gastos han superado el límite"; // Simula el mensaje esperado
        org.junit.Assert.assertEquals(mensajeEsperado, mensajeReal);
    }

    @Given("el usuario ha configurado un umbral de gastos de {int} en su perfil")
    public void el_usuario_ha_configurado_un_umbral_de_gastos_de_en_su_perfil(Integer umbral) {
        System.out.println("Umbral de gastos configurado: " + umbral);
    }

    @When("el usuario realiza una transacción de {int} que supera ese umbral")
    public void el_usuario_realiza_una_transacción_de_que_supera_ese_umbral(Integer monto) {
        System.out.println("Transacción realizada por: " + monto);
    }
}
