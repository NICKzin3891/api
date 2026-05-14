package br.belval.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * CORS = Cross Origin Resource Sharing /
 * 	   	  Compartilhamento Cruzado de Origem Recurso
 * 
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
	
	
	
	public void addCorsMapping(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOrigins("https://localhost:5173")
		.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH")
		.allowedHeaders("*");
	}
	
}
