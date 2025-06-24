package com.safebudget.cashlife.pages;

public class InflationReportPage {
    public static boolean isChartVisible() {
        System.out.println("Verificar que el gráfico de inflación anual esté visible");
        return true; // Simulando que el gráfico está visible
    }

    public static void compararConPromedioNacional() {
        System.out.println("Comparar el gráfico de inflación anual con el promedio nacional");
    }

    public static boolean isComparisonChartDisplayed() {
        System.out.println("Verificar que el gráfico de comparación de inflación esté visible");
        return true; // Simulando que el gráfico de comparación está visible
    }

    public static boolean isNoDataErrorDisplayed() {
        System.out.println("Verificar que se muestre un mensaje de error si no hay datos de inflación disponibles");
        return true; // Simulando que el mensaje de error está visible
    }
}
