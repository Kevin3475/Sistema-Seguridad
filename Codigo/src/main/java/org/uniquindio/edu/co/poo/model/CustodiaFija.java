package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;
import java.util.List;

public class CustodiaFija extends Servicio{

    private List<Vigilante> vigilantes;

    public CustodiaFija(String codigo, String cliente, double tarifaMensual) {
        super(codigo, cliente, tarifaMensual);

        this.vigilantes = new ArrayList<Vigilante>();

    }

    public List<Vigilante> getVigilantes() {
        return vigilantes;
    }

    public void setVigilantes(List<Vigilante> vigilantes) {
        this.vigilantes = vigilantes;
    }
}
