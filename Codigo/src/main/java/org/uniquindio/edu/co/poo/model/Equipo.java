package org.uniquindio.edu.co.poo.model;

public class Equipo {

    private String codigo;
    private TipoEquipo tipo;
    private double valorReposicion;

    public Equipo(String codigo, TipoEquipo tipo, double valorReposicion) {

        this.codigo = codigo;
        this.tipo = tipo;
        this.valorReposicion = valorReposicion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoEquipo getTipo() {
        return tipo;
    }

    public void setTipo(TipoEquipo tipo) {
        this.tipo = tipo;
    }

    public double getValorReposicion() {
        return valorReposicion;
    }

    public void setValorReposicion(double valorReposicion) {
        this.valorReposicion = valorReposicion;
    }
}
