
package com.ModeFairAssessment.manageProduct;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@ComponentScan(basePackages={
	"com.ModeFairAssessment.manageProduct.service",
	"com.ModeFairAssessment.manageProduct.model",
	"com.ModeFairAssessment",
	"com.ModeFairAssessment.manageProduct.repo",
	
})

@SpringBootApplication
public class ManageProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageProductApplication.class, args);
	}

	@Bean
	public CorsFilter corsFitler(){
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin","Content-Type,",
		"Accept","Authorization","Origin, Accept","X-Requested-With",
		"Acces-Control-Request-Method","Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin","Content-Type","Accept","Authorization","Access-Control-Allow-Origin",
		"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"));

		corsConfiguration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE","OPTIONS"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(source);
	}

}
