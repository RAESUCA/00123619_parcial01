package com.RAES.x00123619;

public class PlazaFija extends Empleado {
    private int extension;

    public PlazaFija(String nombre, String puesto, Double salario, int extension) {
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
