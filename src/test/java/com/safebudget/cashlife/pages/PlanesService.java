package com.safebudget.cashlife.pages;

public class PlanesService {

    public static void crearPlan(String nombrePlan, String montoObjetivo, String fechaLimite) {
        System.out.println("Creando un plan financiero con los siguientes detalles:");
        System.out.println("Nombre del plan: " + nombrePlan);
        System.out.println("Monto objetivo: " + montoObjetivo);
        System.out.println("Fecha límite: " + fechaLimite);
    }

    public static void verificarExistenciaPlan(String idPlan) {
        System.out.println("Verificando la existencia del plan con ID: " + idPlan);
    }

    public static void intentarCrearPlan(String nombrePlan, String monto, String fechaLimite) {
        System.out.println("Intentando crear un plan con los siguientes datos:");
        System.out.println("Nombre del plan: " + nombrePlan);
        System.out.println("Monto: " + monto);
        System.out.println("Fecha límite: " + fechaLimite);
        // Aquí se simula un error por datos inválidos
        if (nombrePlan.isEmpty() || monto.isEmpty() || fechaLimite.isEmpty()) {
            System.out.println("Error: Datos incompletos para crear el plan.");
        } else {
            System.out.println("Plan creado exitosamente.");
        }
    }
}
