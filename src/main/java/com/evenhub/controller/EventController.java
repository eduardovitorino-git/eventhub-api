package com.evenhub.controller;

import com.evenhub.dto.EventDto;
import com.evenhub.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    private final EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping("/events")
    public List<EventDto> findAll() {
        return service.findAll();
    }
}
