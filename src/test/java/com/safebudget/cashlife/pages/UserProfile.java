package com.safebudget.cashlife.pages;

public class UserProfile {
    public static void verifyProfileUpdated() {
        System.out.println("Verificar que el perfil ha sido actualizado correctamente");
    }

    public static void loadGastosParaAno(String año) {
        System.out.println("Cargar gastos para el año: " + año);
    }

    public static void loadWithoutInflationData(String idUsuario) {
        System.out.println("Cargar datos de gastos sin inflación para el usuario con ID: " + idUsuario);
    }

    public static void setSpendingThreshold(int umbral) {
        System.out.println("Configurar umbral de gastos en el perfil del usuario: " + umbral);
    }
}
