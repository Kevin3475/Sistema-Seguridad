package org.uniquindio.edu.co.poo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaGestion implements IAuditable, IAgendable {

    private String nombre;
    private String nit;
    private List<Empleado> empleados;
    private List<Servicio> servicios;
    private List<Equipo> equipos;
    private List<RegistroNovedad> novedades;
    private List<Agenda> agendas;

    public SistemaGestion(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.empleados = new ArrayList<>();
        this.servicios = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.novedades = new ArrayList<>();
        this.agendas = new ArrayList<>();
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }

    public List<Empleado> getEmpleados() { return empleados; }
    public List<Servicio> getServicio() { return servicios; }
    public List<Equipo> getEquipo() { return equipos; }
    public List<RegistroNovedad> getNovedades() { return novedades; }
    public List<Agenda> getAgendas() { return agendas; }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado buscarEmpleadoPorId(String id) {
        for (Empleado e : empleados) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public boolean eliminarEmpleado(String id) {
        Empleado e = buscarEmpleadoPorId(id);
        if (e != null) {
            empleados.remove(e);
            return true;
        }
        return false;
    }

    public boolean actualizarEmpleado(String id, Empleado nuevoEmpleado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId().equals(id)) {
                empleados.set(i, nuevoEmpleado);
                return true;
            }
        }
        return false;
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public Servicio buscarServicioPorCodigo(String codigo) {
        for (Servicio s : servicios) {
            if (s.getCodigo().equals(codigo)) {
                return s;
            }
        }
        return null;
    }

    public boolean eliminarServicio(String codigo) {
        Servicio s = buscarServicioPorCodigo(codigo);
        if (s != null) {
            servicios.remove(s);
            return true;
        }
        return false;
    }

    public boolean actualizarServicio(String codigo, Servicio nuevoServicio) {
        for (int i = 0; i < servicios.size(); i++) {
            if (servicios.get(i).getCodigo().equals(codigo)) {
                servicios.set(i, nuevoServicio);
                return true;
            }
        }
        return false;
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public Equipo buscarEquipoPorCodigo(String codigo) {
        for (Equipo eq : equipos) {
            if (eq.getCodigo().equals(codigo)) {
                return eq;
            }
        }
        return null;
    }

    public boolean eliminarEquipo(String codigo) {
        Equipo eq = buscarEquipoPorCodigo(codigo);
        if (eq != null) {
            equipos.remove(eq);
            return true;
        }
        return false;
    }

    public boolean actualizarEquipo(String codigo, Equipo nuevoEquipo) {
        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i).getCodigo().equals(codigo)) {
                equipos.set(i, nuevoEquipo);
                return true;
            }
        }
        return false;
    }

    public void agregarNovedad(RegistroNovedad novedad) {
        novedades.add(novedad);
    }

    public RegistroNovedad buscarNovedadPorDescripcion(String descripcion) {
        for (RegistroNovedad n : novedades) {
            if (n.descripcion().equalsIgnoreCase(descripcion)) {
                return n;
            }
        }
        return null;
    }

    public boolean eliminarNovedad(String descripcion) {
        RegistroNovedad n = buscarNovedadPorDescripcion(descripcion);
        if (n != null) {
            novedades.remove(n);
            return true;
        }
        return false;
    }

    public boolean actualizarNovedad(String descripcion, RegistroNovedad nuevaNovedad) {
        for (int i = 0; i < novedades.size(); i++) {
            if (novedades.get(i).descripcion().equalsIgnoreCase(descripcion)) {
                novedades.set(i, nuevaNovedad);
                return true;
            }
        }
        return false;
    }

    @Override
    public void programarFechaHora(LocalDate fecha, String descripcion) {
        Agenda nueva = new Agenda(fecha, descripcion);
        agendas.add(nueva);
        System.out.println(" Agenda creada para el " + fecha + " - " + descripcion);
    }

    @Override
    public ArrayList<Agenda> obtnerAgendaDesde(LocalDate fecha) {
        ArrayList<Agenda> lista = new ArrayList<>();
        for (Agenda a : agendas) {
            if (!a.getFecha().isBefore(fecha)) {
                lista.add(a);
            }
        }
        return lista;
    }

    @Override
    public ArrayList<RegistroNovedad> obtenerNovedades() {
        return new ArrayList<>(novedades);
    }

    @Override
    public void registrarNovedades() {
        RegistroNovedad nueva = new RegistroNovedad(
                LocalDateTime.now(),
                LocalDateTime.now(),
                "Revisión automática del sistema",
                "INFO"
        );
        novedades.add(nueva);
        System.out.println(" Novedad registrada: " + nueva.descripcion());
    }

    public void mostrarAgendas() {
        System.out.println("=== Agendas programadas ===");
        for (Agenda a : agendas) {
            System.out.println(a.getFecha() + " → " + a.getDescripcion());
        }
    }

    public void mostrarNovedades() {
        System.out.println("=== Registro de Novedades ===");
        for (RegistroNovedad n : novedades) {
            System.out.println(n.fecha() + " | " + n.descripcion() + " (" + n.tipo() + ")");
        }
    }
}
