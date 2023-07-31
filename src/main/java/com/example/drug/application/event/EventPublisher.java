package com.example.drug.application.event;

import com.example.drug.application.holder.LogRefIdHolder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventPublisher implements PublishEvent {
    private final ApplicationEventPublisher eventPublisher;

    @Override
    public void publish(TimoAppEvent event) {
        event.setRefId(LogRefIdHolder.get());
        eventPublisher.publishEvent(event);
    }
}
