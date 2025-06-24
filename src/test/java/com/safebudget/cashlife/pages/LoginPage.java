package com.safebudget.cashlife.pages;

public class LoginPage {
    public static void openLoginPage() {
        System.out.println("Navegar a la página de inicio de sesión");
    }

    public static void enterCredentials(String username, String password) {
        System.out.println("Ingresar usuario: " + username + " y contraseña: " + password);
    }

    public static void submit() {
        System.out.println("Enviar formulario de inicio de sesión");
    }

    public static boolean isAuthErrorDisplayed() {
        System.out.println("Verificar si se muestra un mensaje de error de autenticación");
        return false; // Cambiar según la lógica real
    }
}
