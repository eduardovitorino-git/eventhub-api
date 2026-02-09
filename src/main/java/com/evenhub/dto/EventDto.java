package com.evenhub.dto;

public record EventDto(
        Long id,
        Long name,
        Long event_date,
        Long venue,
        Long capacity,
        Long created_at,
        Long updated_at
) {
}
