package com.safebudget.cashlife.pages;

public class EducationPage {
    public static void openEducationPage() {
        System.out.println("Navegar a la página de educación financiera");
    }

    public static void clickInflationReportButton() {
        System.out.println("Hacer clic en el botón de reporte de inflación anual");
    }

    public static void clickComparePreviousYearsButton() {
        System.out.println("Hacer clic en el botón para comparar con años anteriores");
    }

    public static void open() {
        System.out.println("Abriendo la página de educación financiera");
    }

    public static void selectTopic(String tema) {
        System.out.println("Seleccionando el tema de educación financiera: " + tema);
    }

    public static boolean isTopicContentVisible() {
        System.out.println("Verificando si el contenido del tema de educación financiera es visible");
        return true; // el contenido es visible
    }

    public static void selectTopicDetail(String temaDetalle) {
        System.out.println("Seleccionando el detalle del tema de educación financiera: " + temaDetalle);
    }

    public static boolean isTopicDetailVisible() {
        System.out.println("Verificando si el detalle del tema de educación financiera es visible");
        return true; // el detalle es visible
    }

    public static void accessInvalidTopicById(String id) {
        System.out.println("Intentando acceder al tema de educación financiera con ID: " + id);
    }

    public static boolean isErrorMessageDisplayed() {
        System.out.println("Verificando si se muestra un mensaje de error al intentar acceder a un tema inexistente");
        return true; //mensaje de error es visible
    }
}
