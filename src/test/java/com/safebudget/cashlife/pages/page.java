package com.safebudget.cashlife.pages;

public class page {

    public void openPage(String pageName) {
        System.out.println("Abriendo la página: " + pageName);

    }
    public void waitForElement(String elementName) {
        System.out.println("Esperando a que el elemento esté disponible: " + elementName);

    }
    public void closePage() {
        System.out.println("Cerrando la página actual");

    }
    public void navigateTo(String url) {
        System.out.println("Navegando a la URL: " + url);

    }
    public void refreshPage() {
        System.out.println("Refrescando la página actual");

    }
    public void goBack() {
        System.out.println("Volviendo a la página anterior");

    }
}
