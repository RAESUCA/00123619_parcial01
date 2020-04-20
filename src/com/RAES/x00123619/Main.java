package com.RAES.x00123619;

import java.text.DecimalFormat;

public class Main {
    public static Double total;

    public static void main(String[] args){

        ServicioProfesional servicio = new ServicioProfesional("Empleado 1", "Capitan", 935.25,
                20);
        PlazaFija plaza = new PlazaFija("Empleado 2", "Director", 809.65, 00123456);

       total = CalculadoraImpuestos.calcularPago(servicio);
        total = Double.valueOf(new DecimalFormat("#.##").format(total));
        System.out.println("Pago Servicio: $"+ total);
        System.out.println(CalculadoraImpuestos.mostrarTotales());

        System.out.println();

        total = CalculadoraImpuestos.calcularPago(plaza);
        total = Double.valueOf(new DecimalFormat("#.##").format(total));
        System.out.println("Pago Plaza: $"+ total);
        System.out.println(CalculadoraImpuestos.mostrarTotales());
    }
}
