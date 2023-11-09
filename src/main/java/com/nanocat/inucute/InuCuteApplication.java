package com.nanocat.inucute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(DatabaseConfigProperties.class)
public class InuCuteApplication {

	public static void main(String[] args) {
		SpringApplication.run(InuCuteApplication.class, args);
	}

}
