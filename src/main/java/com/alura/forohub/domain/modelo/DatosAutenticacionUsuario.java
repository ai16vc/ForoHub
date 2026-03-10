package com.alura.forohub.domain.modelo;

import jakarta.validation.constraints.NotBlank;

public record DatosAutenticacionUsuario(
        @NotBlank
        String login,
        @NotBlank
        String clave
) {
}