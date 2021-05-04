package com.cognizant.swaggerdocumentation.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ServiceDescriptionUpdater {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDescriptionUpdater.class);
	
	private static final String DEFAULT_SWAGGER_URL="/v2/api-docs";
	private static final String KEY_SWAGGER_URL="swagger_url";
	
	private final RestTemplate template;
	
	public ServiceDescriptionUpdater(){
		this.template = new RestTemplate();
	}
	
	@Scheduled(fixedDelayString= "${swagger.config.refreshrate}")
	public void refreshSwaggerConfigurations(){
		LOGGER.debug("Starting Service Definition Context refresh");
	}
	
	public String getJSON(String serviceId, Object jsonData){
		try {
			return new ObjectMapper().writeValueAsString(jsonData);
		} catch (JsonProcessingException e) {
			LOGGER.error("Error : {} ", e.getMessage());
			return "";
		}
	}
}
