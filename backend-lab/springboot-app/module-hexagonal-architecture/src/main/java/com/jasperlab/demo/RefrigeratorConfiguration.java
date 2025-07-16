package com.jasperlab.demo;

import com.jasperlab.demo.application.domain.service.RefrigeratorService;
import com.jasperlab.demo.application.domain.service.ReportGeneratorService;
import com.jasperlab.demo.application.port.in.GenerateReportUseCase;
import com.jasperlab.demo.application.port.in.RefrigeratorUseCase;
import com.jasperlab.demo.application.port.out.ItemPort;
import com.jasperlab.demo.application.port.out.ReportLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RefrigeratorConfiguration {

    @Bean
    public RefrigeratorUseCase refrigeratorUseCase(ItemPort storage) {
        return new RefrigeratorService(storage);
    }

    @Bean
    public GenerateReportUseCase generateReportUseCase(ReportLogger logger) {
        return new ReportGeneratorService(logger);
    }
}
