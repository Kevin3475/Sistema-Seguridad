package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;

public interface IAuditable {

    public ArrayList<RegistroNovedad> obtenerNovedades();

    public void registrarNovedades();
}
