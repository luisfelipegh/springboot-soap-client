
package com.example.consumingwebservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.consumingwebservice.placetopay.GetTransactionInformationBySessionIDResponse;


@SpringBootApplication
public class ConsumingWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingWebServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(PlacetopayClient quoteClient) {
		return args -> {
			try {
			GetTransactionInformationBySessionIDResponse response = quoteClient.getBySessionID("f32a31d103ceab5fae80838a48886d47");
			System.out.println(response.getGetTransactionInformationBySessionIDResult().getDescription());
			System.out.println(response.getGetTransactionInformationBySessionIDResult().getReference());	
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
			}
			
		};
	}

}
