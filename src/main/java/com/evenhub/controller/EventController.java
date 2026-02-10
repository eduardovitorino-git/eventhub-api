package com.evenhub.controller;

import com.evenhub.dto.EventDto;
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
    public EventDto save(@Valid @RequestBody EventDto eventDto) {
        return service.save(eventDto);
    }

    @GetMapping("/events")
    public List<EventDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/events/{id}")
    public EventDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

}
