package br.com.bidup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BidupPlataformApplication {

	public static void main(String[] args) {
		SpringApplication.run(BidupPlataformApplication.class, args);
	}

}
