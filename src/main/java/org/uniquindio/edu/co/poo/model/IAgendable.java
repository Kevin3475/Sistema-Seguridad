package org.uniquindio.edu.co.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IAgendable {

    public void programarFechaHora(LocalDate fecha, String descripcion);

    public  ArrayList<Agenda> obtnerAgendaDesde(LocalDate fecha);
}
