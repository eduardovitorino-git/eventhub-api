package com.evenhub.controller;

import com.evenhub.dto.EventCreateDto;
import com.evenhub.dto.EventResponseDto;
import com.evenhub.dto.EventUpdateDto;
import com.evenhub.service.EventService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    private final EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @PostMapping("/events")
    public EventResponseDto save(@Valid @RequestBody EventCreateDto eventCreateDto) {
        return service.save(eventCreateDto);
    }

    @GetMapping("/events")
    public List<EventResponseDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/events/{id}")
    public EventResponseDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/events/{id}")
    public EventResponseDto update(@PathVariable Long id,
                                   @Valid @RequestBody EventUpdateDto eventUpdateDto) {
        return service.update(id, eventUpdateDto);
    }
}
