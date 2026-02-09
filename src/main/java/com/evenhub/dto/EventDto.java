package com.evenhub.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record EventDto(
        Long id,
        @NotBlank(message = "O nome do evento é obrigatório.")
        String name,
        @NotNull(message = "A data do evento é obrigatória.")
        @Future(message = "A data do evento deve ser futura.")
        LocalDateTime eventDate,
        String venue,
        Long capacity,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
