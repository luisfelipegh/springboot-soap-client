
package com.example.consumingwebservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class PlacetopayConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("com.example.consumingwebservice.placetopay");
		return marshaller;
	}

	@Bean
	public PlacetopayClient countryClient(Jaxb2Marshaller marshaller) {
		PlacetopayClient client = new PlacetopayClient();
		client.setDefaultUri("https://api.placetopay.com/soap/placetopay");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
