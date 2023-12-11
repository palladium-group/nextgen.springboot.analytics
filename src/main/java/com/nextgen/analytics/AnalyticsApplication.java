package com.nextgen.analytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnalyticsApplication {

	public static void main(String[] args) {
//		SpringApplication application = new SpringApplication(AnalyticsApplication.class);
//		application.setAdditionalProfiles("ssl");
//		application.run(args)
		SpringApplication.run(AnalyticsApplication.class, args);
	}

}
