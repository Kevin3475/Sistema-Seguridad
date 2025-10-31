package org.uniquindio.edu.co.poo.model;

import java.time.LocalDateTime;

public record RegistroNovedad(
        LocalDateTime fecha,
        LocalDateTime hora,
        String descripcion,
        String tipo
) {

}
