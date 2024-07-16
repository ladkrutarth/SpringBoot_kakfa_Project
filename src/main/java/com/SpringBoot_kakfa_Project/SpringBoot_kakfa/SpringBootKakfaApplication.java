package com.SpringBoot_kakfa_Project.SpringBoot_kakfa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringBootKakfaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKakfaApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner (KafkaTemplate<String, String>kafkaTemplate) {
		return args -> {

			for (int i =0; i<100; i++)
			{
				kafkaTemplate.send("Krutarth", "Hello Kuku " + i);
			}



		};
	}
}

