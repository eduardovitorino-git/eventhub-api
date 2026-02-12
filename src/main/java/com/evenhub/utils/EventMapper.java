package com.evenhub.utils;

import com.evenhub.dto.EventCreateDto;
import com.evenhub.dto.EventResponseDto;
import com.evenhub.dto.EventUpdateDto;
import com.evenhub.entity.Event;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface EventMapper {
    Event toEntity(EventCreateDto dto);
    EventResponseDto toResponseDto(Event event);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(EventUpdateDto dto, @MappingTarget Event event);
}
