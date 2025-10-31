package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Empleado implements IAgendable{

    private String nombre;
    private String id;
    private Turno turno;
    private double salarioBase;
    private List<Equipo> listEquipos;

    public Empleado(String nombre, String id, Turno turno, double salarioBase) {

        this.nombre = nombre;
        this.id = id;
        this.turno = turno;
        this.salarioBase = salarioBase;
        this.listEquipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public List<Equipo> getListEquipos() {
        return listEquipos;
    }

    public void setListEquipos(List<Equipo> listEquipos) {
        this.listEquipos = listEquipos;
    }
}
