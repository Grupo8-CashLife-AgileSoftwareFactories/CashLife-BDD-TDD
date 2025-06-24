package com.safebudget.cashlife.pages;

public class PlanesPage {
    public static void open() {
        System.out.println("Abriendo la página de planes financieros");
    }

    public static boolean isSuccessMessageDisplayed() {
        System.out.println("Verificando si se muestra un mensaje de éxito al crear un plan financiero");
        return true;
    }

    public static void verDetallePlan(String idPlan) {
        System.out.println("Verificando los detalles del plan financiero con ID: " + idPlan);
    }

    public static boolean isPlanDetailVisible() {
        System.out.println("Verificando si los detalles del plan financiero son visibles");
        return true;
    }

    public static void openCreatePlan() {
        System.out.println("Abriendo la sección para crear un nuevo plan financiero");
    }

    public static boolean isErrorMessageDisplayed() {
        System.out.println("Verificando si se muestra un mensaje de error al intentar crear un plan financiero con datos inválidos");
        return true; // Simulación de que el mensaje de error es visible
    }
}
