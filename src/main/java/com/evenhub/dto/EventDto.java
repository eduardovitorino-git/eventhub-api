package com.evenhub.dto;

import java.time.LocalDateTime;

public record EventDto(
        Long id,
        String name,
        LocalDateTime eventDate,
        String venue,
        Long capacity,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
