package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Empleado{


    private double bono;
    private List<Vigilante> vigilantes;

    public Supervisor(String nombre, String id, Turno turno, double salarioBase,double bono) {
        super(nombre, id, turno, salarioBase);

        this.bono = bono;
        this.vigilantes = new ArrayList<Vigilante>();

    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public List<Vigilante> getVigilantes() {
        return vigilantes;
    }

    public void setVigilantes(List<Vigilante> vigilantes) {
        this.vigilantes = vigilantes;
    }
}
