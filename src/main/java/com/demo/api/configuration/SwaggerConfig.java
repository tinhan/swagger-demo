package com.demo.api.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
@EnableAutoConfiguration
public class SwaggerConfig {
	
	@Value("${swagger.option}")
	private boolean swaggerOption;
	
	@Bean
	public Docket contactApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Redhat")
				.apiInfo(apiInfo())
				.enable(swaggerOption)
				.select()
				.paths(categoryPaths()).build();
	}

	private Predicate<String> categoryPaths() {
		return regex("/ThaiPost.*");
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("API with Swagger Demo Application")
				.description("This is a sample API with Swagger.")
				.termsOfServiceUrl("")
				.license("Apache License Version 2.0")
				.licenseUrl("")
				.version("1.0").build();
	}
}
