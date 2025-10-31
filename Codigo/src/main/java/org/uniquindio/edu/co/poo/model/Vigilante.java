package org.uniquindio.edu.co.poo.model;

public class Vigilante extends Empleado{

    private int puesto;
    private TipoArma arma;

    public Vigilante(String nombre, String id, Turno turno, double salarioBase,int puesto,TipoArma arma) {
        super(nombre, id, turno, salarioBase);

        this.puesto = puesto;
        this.arma = arma;

    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public TipoArma getArma() {
        return arma;
    }

    public void setArma(TipoArma arma) {
        this.arma = arma;
    }
}
