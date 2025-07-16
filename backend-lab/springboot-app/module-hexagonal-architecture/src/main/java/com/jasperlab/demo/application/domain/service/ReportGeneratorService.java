package com.jasperlab.demo.application.domain.service;

import com.jasperlab.demo.application.port.in.GenerateReportUseCase;
import com.jasperlab.demo.application.port.out.ReportLogger;


public class ReportGeneratorService implements GenerateReportUseCase {

    private final ReportLogger reportLogger;

    public ReportGeneratorService(ReportLogger reportLogger) {
        this.reportLogger = reportLogger;
    }

    @Override
    public void generate() {
        // Simulate report generation
        String reportContent = "Report generated with items: [Item1, Item2, Item3]";

        // Log the generated report
        reportLogger.log(reportContent);
    }
}
