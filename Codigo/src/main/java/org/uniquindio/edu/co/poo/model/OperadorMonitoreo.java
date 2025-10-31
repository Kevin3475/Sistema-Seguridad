package org.uniquindio.edu.co.poo.model;

public class OperadorMonitoreo extends Empleado{

    private int zona;

    public OperadorMonitoreo(String nombre, String id, Turno turno, double salarioBase,int zona) {
        super(nombre, id, turno, salarioBase);

        this.zona = zona;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }
}
