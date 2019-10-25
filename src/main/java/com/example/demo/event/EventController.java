package com.example.demo.event;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventController {

    private final CustomEventPublisher customEventPublisher;

    @GetMapping("/event")
    public void event() {
        customEventPublisher.doStuffAndPublishAnEvent("event test");
    }

    @GetMapping("/asyncEvent")
    public void asyncEvent() {
        customEventPublisher.doStuffAndPublishAnEvent("event test");
    }
}
