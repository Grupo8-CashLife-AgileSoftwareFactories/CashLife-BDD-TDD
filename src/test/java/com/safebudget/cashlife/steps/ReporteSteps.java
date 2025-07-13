package com.safebudget.cashlife.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ReporteSteps {

    @When("el usuario selecciona {string} para el año {int}")
    public void el_usuario_selecciona_para_el_año(String opcion, Integer anio) {
        System.out.println("Usuario selecciona: " + opcion + " para el año " + anio);
    }

    @Then("el sistema mostrará el gráfico de inflación anual con los datos correspondientes")
    public void el_sistema_mostrara_el_grafico_de_inflacion_anual() {
        System.out.println("Sistema muestra gráfico de inflación anual");
    }

    @When("el usuario selecciona la opción {string} para el año {int}")
    public void el_usuario_selecciona_la_opcion_para_el_año(String opcion, Integer anio) {
        System.out.println("Usuario selecciona opción: " + opcion + " para el año " + anio);
    }

    @Then("el sistema mostrará una comparación visual de la inflación actual con los años anteriores")
    public void el_sistema_mostrara_comparacion_visual() {
        System.out.println("Sistema muestra comparación visual de inflación");
    }

    @When("el usuario ingresa su consulta {string} en el campo {string} y selecciona {string}")
    public void el_usuario_ingresa_su_consulta_en_el_campo_y_selecciona(String consulta, String campo, String boton) {
        System.out.println("Consulta: " + consulta + ", Campo: " + campo + ", Botón: " + boton);
    }

    @Then("el sistema confirmará que la consulta fue recibida")
    public void el_sistema_confirmara_consulta_recibida() {
        System.out.println("Sistema confirma recepción de consulta");
    }

    @Then("mostrará el mensaje {string}")
    public void mostrara_el_mensaje(String mensaje) {
        System.out.println("Mensaje mostrado: " + mensaje);
    }

    @When("el usuario deja el campo {string} vacío o ingresa {string}")
    public void el_usuario_deja_el_campo_vacio_o_ingresa(String campo, String valor) {
        System.out.println("Campo: " + campo + " vacío o valor: " + valor);
    }

    @Then("el sistema mostrará el mensaje {string}")
    public void el_sistema_mostrara_el_mensaje(String mensaje) {
        System.out.println("Mensaje mostrado: " + mensaje);
    }
}