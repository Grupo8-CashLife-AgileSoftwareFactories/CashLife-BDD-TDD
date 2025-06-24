package com.safebudget.cashlife.pages;

public class RegistrationPage {
    public static void openRegistrationPage() {
        System.out.println("Navegar a la página de registro");
    }

    public static void enterRegistrationDetails(String username, String password, String email) {
        System.out.println("Ingresar usuario: " + username + ", contraseña: " + password + ", y correo electrónico: " + email);
    }

    public static void submitRegistration() {
        System.out.println("Enviar formulario de registro");
    }

    public static boolean isRegistrationSuccessMessageDisplayed() {
        System.out.println("Verificar si se muestra un mensaje de éxito de registro");
        return true;
    }

    public static void openForUserType(String tipoUsuario) {
        System.out.println("Abrir formulario de registro para el tipo de usuario: " + tipoUsuario);
        openRegistrationPage();
    }

    public static void fillFields(String user, String pass) {
        System.out.println("Llenar campos de registro con usuario: " + user + " y contraseña: " + pass);
        enterRegistrationDetails(user, pass, " " + user + "@example.com");
    }

    public static String getSuccessMessage() {
        System.out.println("Obtener mensaje de éxito de registro");
        return "Registro exitoso";
    }

    public static void open() {
        System.out.println("Abriendo la página de registro");
        openRegistrationPage();
    }

    public static void fillValidData() {
        System.out.println("Llenar datos válidos para el registro");
        enterRegistrationDetails("usuarioValido", "contraseñaSegura", "usuarioValido@example.com");
    }

    public static void acceptTerms() {
        System.out.println("Aceptar términos y condiciones del registro");
    }

    public static boolean isWelcomeMessageDisplayed() {
        System.out.println("Verificar si se muestra un mensaje de bienvenida después del registro");
        return true; // Simulación de que el mensaje de bienvenida es visible
    }

    public static void leaveFieldsEmpty() {
        System.out.println("Dejar campos obligatorios vacíos en el formulario de registro");
    }

    public static boolean areErrorsDisplayed() {
        System.out.println("Verificar si se muestran mensajes de error en los campos requeridos del formulario de registro");
        return true; // Simulación de que los mensajes de error son visibles
    }
}
