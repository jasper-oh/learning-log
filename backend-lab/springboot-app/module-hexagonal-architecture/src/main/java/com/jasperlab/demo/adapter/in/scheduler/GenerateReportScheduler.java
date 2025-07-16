package com.jasperlab.demo.adapter.in.scheduler;

import com.jasperlab.demo.application.port.in.GenerateReportUseCase;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GenerateReportScheduler {

    private final GenerateReportUseCase useCase;

    @Scheduled(fixedRate = 600000)
    public void triggerReportGeneration() {
        useCase.generate();
    }
}
