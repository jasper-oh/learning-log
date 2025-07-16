package com.jasperlab.demo.adapter.out.logging;

import com.jasperlab.demo.application.port.out.ReportLogger;
import org.springframework.stereotype.Component;

@Component
public class ConsoleLogger implements ReportLogger {
    @Override
    public void log(String reportContent) {
        System.out.println("[Report Log] " + reportContent);
    }
}
