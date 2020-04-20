package com.RAES.x00123619;

import java.text.DecimalFormat;

public final class CalculadoraImpuestos {
    private static Double totalRenta;
    private static Double totalISSS;
    private static Double totalAFP;
    private static Double restante;
    private static String mostrar;

    private CalculadoraImpuestos() {
    }

    public static Double calcularPago(Empleado x) {
        if (x instanceof PlazaFija) {
            totalAFP = 0.0625 * x.salario;
            totalISSS = 0.03 * x.salario;
            restante = x.salario - totalAFP - totalISSS;
            if (restante > 0.01 && restante < 472.00) {
                totalRenta = 0.00;
            } else if (restante > 472.01 && restante < 895.24) {
                totalRenta = 0.1 * (restante - 472) + 17.67;
            } else if (restante > 895.25 && restante < 2038.10) {
                totalRenta = 0.2 * (restante - 895.24) + 60;
            } else if (restante > 2038.11) {
                totalRenta = 0.3 * (restante - 2038.10) + 288.57;
            }
            return restante-totalRenta;
        }
        else {
            totalRenta = 0.1* x.salario;
            totalAFP = 0.00;
            totalISSS = 0.00;
            return x.salario-totalRenta;
        }
    }

    public static String mostrarTotales(){
        totalAFP = Double.valueOf(new DecimalFormat("#.##").format(totalAFP));
        totalISSS =Double.valueOf(new DecimalFormat("#.##").format(totalISSS));
        totalRenta = Double.valueOf(new DecimalFormat("#.##").format(totalRenta));
        mostrar = "Renta: $"+ Double.toString(totalRenta) + " ISSS: $" + Double.toString(totalISSS) +
                " AFP: $" + Double.toString(totalAFP);
        return mostrar;
    }
}


