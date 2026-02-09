package com.evenhub.dto;

import java.sql.Timestamp;

public record EventDto(
        Long id,
        String name,
        Timestamp event_date,
        String venue,
        Long capacity,
        Timestamp created_at,
        Timestamp updated_at
) {
}
