package com.evenhub.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record EventUpdateDto(
        @NotBlank(message = "O nome do evento é obrigatório.")
        String name,
        @Future(message = "A data do evento deve ser futura.")
        LocalDateTime eventDate,
        String venue,
        Long capacity,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
