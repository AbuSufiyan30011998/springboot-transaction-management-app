package com.abus.tx;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableTransactionManagement
@EnableSwagger2
public class FlightServiceExampleApplication {


	public static void main(String[] args) {
		SpringApplication.run(FlightServiceExampleApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.paths(PathSelectors.ant("/bookFlightTicket"))
				.apis(RequestHandlerSelectors.basePackage("com.abus.tx"))
				.build().apiInfo(apiCustomData());
	}

	private ApiInfo apiCustomData() {
		return new ApiInfo("Flight Booking Application", "Flight booking service Documentation", "1.0",
				"Flight Booking Service Terms",
				new Contact("Abu Sufiyan", "http://thinkconstructive.com", "abu9984sufiyan@gmail.com"),
				"Think Constructive License", "http://thinkconstructive.com", Collections.emptyList());
	}

}
