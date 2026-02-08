package com.evenhub.service;

import com.evenhub.entity.Event;
import com.evenhub.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository repository;

    public EventServiceImpl(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> findAll() {
        return repository.findAll();
    }
}
