package com.evenhub.service;

import com.evenhub.dto.EventDto;
import com.evenhub.repository.EventRepository;
import com.evenhub.utils.EventMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository repository;
    private final EventMapper mapper;

    public EventServiceImpl(EventRepository repository, EventMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<EventDto> findAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }
}
