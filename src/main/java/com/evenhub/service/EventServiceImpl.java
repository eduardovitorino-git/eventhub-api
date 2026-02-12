package com.evenhub.service;

import com.evenhub.dto.EventCreateDto;
import com.evenhub.dto.EventResponseDto;
import com.evenhub.dto.EventUpdateDto;
import com.evenhub.entity.Event;
import com.evenhub.exception.EventNotFoundException;
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

    @Override
    public List<EventResponseDto> findAll() {
        return repository.findAll().stream()
                .map(mapper::toResponseDto)
                .toList();
    }

    @Override
    public EventResponseDto findById(Long id) {
        return repository.findById(id)
                .map(mapper::toResponseDto)
                .orElseThrow(() -> new EventNotFoundException("Evento não encontrado"));
    }

    @Override
    public EventResponseDto save(EventCreateDto eventCreateDto) {
        Event event = mapper.toEntity(eventCreateDto);
        return mapper.toResponseDto(repository.save(event));
    }

    @Override
    public EventResponseDto update(Long id, EventUpdateDto dto) {
        Event event = repository.findById(id)
                .orElseThrow(() -> new EventNotFoundException("Evento não encontrado"));
        mapper.updateEntityFromDto(dto, event);
        return mapper.toResponseDto(repository.save(event));
    }
}
