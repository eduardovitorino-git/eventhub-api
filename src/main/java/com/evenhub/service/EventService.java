package com.evenhub.service;

import com.evenhub.dto.EventDto;

import java.util.List;

public interface EventService {

    List<EventDto> findAll();

    EventDto findById(Long id);

    EventDto save(EventDto eventDto);

}
