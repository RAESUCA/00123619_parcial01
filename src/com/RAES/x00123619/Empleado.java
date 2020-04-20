package com.RAES.x00123619;

abstract class Empleado {
    protected String nombre;
    protected String puesto;
    protected Double salario;

    public Empleado(String nombre, String puesto, Double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
