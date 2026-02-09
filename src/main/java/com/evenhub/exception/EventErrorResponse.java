package com.evenhub.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventErrorResponse {
    private int status;
    private String message;
    private Long timestamp;

    public EventErrorResponse() {	}

    public EventErrorResponse(int status, String message, Long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

}
