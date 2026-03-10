package com.alura.forohub.domain.modelo;

import jakarta.validation.constraints.NotBlank;


public record DatosActualizacionTopico(
        @NotBlank
        String titulo,

        @NotBlank
        String mensaje
) {
}