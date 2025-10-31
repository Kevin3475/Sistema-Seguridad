package org.uniquindio.edu.co.poo.model;

public class PatrullajeMovil extends Empleado{

    private int ruta;
    private double km;

    public PatrullajeMovil(String nombre, String id, Turno turno, double salarioBase,int ruta, double km) {
        super(nombre, id, turno, salarioBase);

        this.ruta = ruta;
        this.km = km;

    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
