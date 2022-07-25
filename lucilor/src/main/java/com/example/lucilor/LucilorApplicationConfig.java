package com.example.lucilor;

import org.jboss.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LucilorApplicationConfig implements CommandLineRunner{

	private static final Logger logger = Logger.getLogger(LucilorApplicationConfig.class);

	public static void main(String[] args) {
		SpringApplication.run(LucilorApplicationConfig.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.error("App started successfully");
		logger.info("App started successfully");
		logger.debug("App started successfully");
	}
}

