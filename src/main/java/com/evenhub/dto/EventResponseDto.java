package com.evenhub.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record EventResponseDto(
        Long id,
        String name,
        LocalDateTime eventDate,
        String venue,
        Long capacity,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
