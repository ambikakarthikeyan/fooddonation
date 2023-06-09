package com.mscomm.ngoservice;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NgoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NgoServiceApplication.class, args);
	}
	 @Bean
	    public RestTemplate restTemplate(){
	        return new RestTemplate();
	    }
}
