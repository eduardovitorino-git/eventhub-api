package com.evenhub.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "event")
@Getter
@Setter
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private Long name;
    @Column(name = "event_date")
    private Long event_date;
    @Column(name = "venue")
    private Long venue;
    @Column(name = "capacity")
    private Long capacity;
    @Column(name = "created_at")
    private Long created_at;
    @Column(name = "updated_at")
    private Long updated_at;

}
