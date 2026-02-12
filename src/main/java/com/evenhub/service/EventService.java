package com.evenhub.service;

import com.evenhub.dto.EventCreateDto;
import com.evenhub.dto.EventResponseDto;
import com.evenhub.dto.EventUpdateDto;

import java.util.List;

public interface EventService {

    List<EventResponseDto> findAll();

    EventResponseDto findById(Long id);

    EventResponseDto save(EventCreateDto dto);

    EventResponseDto update(Long id, EventUpdateDto dto);
}
