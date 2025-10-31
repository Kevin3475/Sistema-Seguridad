package org.uniquindio.edu.co.poo.model;

public abstract class Servicio implements IAgendable{

    private String codigo;
    private String cliente;
    private double tarifaMensual;
    private EstadoServicio estado;

    public Servicio(String codigo, String cliente, double tarifaMensual) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.tarifaMensual = tarifaMensual;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTarifaMensual() {
        return tarifaMensual;
    }

    public void setTarifaMensual(double tarifaMensual) {
        this.tarifaMensual = tarifaMensual;
    }

    public EstadoServicio getEstado() {
        return estado;
    }

    public void setEstado(EstadoServicio estado) {
        this.estado = estado;
    }
}
