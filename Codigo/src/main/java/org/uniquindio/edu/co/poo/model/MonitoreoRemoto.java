package org.uniquindio.edu.co.poo.model;

public class MonitoreoRemoto extends Empleado{

    private int dispositivo;

    public MonitoreoRemoto(String nombre, String id, Turno turno, double salarioBase,int dispositivo) {
        super(nombre, id, turno, salarioBase);

        this.dispositivo = dispositivo;

    }

    public int getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(int dispositivo) {
        this.dispositivo = dispositivo;
    }
}
