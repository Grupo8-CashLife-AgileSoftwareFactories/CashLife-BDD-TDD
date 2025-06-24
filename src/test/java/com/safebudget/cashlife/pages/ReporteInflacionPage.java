package com.safebudget.cashlife.pages;

public class ReporteInflacionPage {

    public static void openSection(String seccion) {
        System.out.println("Abriendo la sección de reporte de inflación: " + seccion);
    }


    public static void selectOptionForYear(String opcion, int año) {
        System.out.println("Seleccionando la opción '" + opcion + "' para el año " + año);
    }

    public static boolean isAnnualChartVisible() {
        System.out.println("Verificando si el gráfico de inflación anual es visible");
        return true; // Simulación de que el gráfico es visible
    }

    public static void compareWithPreviousYears(int añoActual) {
        System.out.println("Comparando la inflación del año " + añoActual + " con años anteriores");
    }

    public static boolean isComparisonChartVisible() {
        System.out.println("Verificando si el gráfico de comparación de inflación es visible");
        return true; // Simulación de que el gráfico de comparación es visible
    }
}
