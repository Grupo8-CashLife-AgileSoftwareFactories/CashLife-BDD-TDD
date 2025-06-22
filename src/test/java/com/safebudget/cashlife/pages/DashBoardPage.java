package com.safebudget.cashlife.pages;

public class DashBoardPage {
    public static void openDashboard() {
        System.out.println("Navegar al dashboard");
    }

    public static void clickInflationReportButton() {
        System.out.println("Hacer clic en el botón de reporte de inflación anual");
    }

    public static boolean isDisplayed() {
        System.out.println("Verificar que el dashboard esté visible");
        return true; // Simulando que el dashboard está visible
    }
}
