package com.executor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class ExecutorApiConfig implements WebMvcConfigurer {
	
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.
		favorPathExtension(false).
		favorParameter(false).
		parameterName("mediaType").
		ignoreAcceptHeader(false).
		defaultContentType(MediaType.APPLICATION_XML).
		mediaType("json", MediaType.APPLICATION_JSON).
		mediaType("xml", MediaType.APPLICATION_XML);
	}

}
