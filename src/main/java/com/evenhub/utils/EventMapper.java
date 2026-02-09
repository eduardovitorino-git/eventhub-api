package com.evenhub.utils;

import com.evenhub.dto.EventDto;
import com.evenhub.entity.Event;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {
    Event toEntity(EventDto expenseDto);
    EventDto toDto(Event expense);
}
