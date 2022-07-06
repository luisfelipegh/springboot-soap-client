
package com.example.consumingwebservice;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.consumingwebservice.placetopay.Authentication;
import com.example.consumingwebservice.placetopay.GetTransactionInformationBySessionID;
import com.example.consumingwebservice.placetopay.GetTransactionInformationBySessionIDResponse;

public class PlacetopayClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(PlacetopayClient.class);

	public GetTransactionInformationBySessionIDResponse getBySessionID(String sessionID) {

		GetTransactionInformationBySessionID request = new GetTransactionInformationBySessionID();
		request.setAuth(this.getAuth());
		request.setSessionID(sessionID);

		
		log.info("Requesting session for " + sessionID);

		GetTransactionInformationBySessionIDResponse response = (GetTransactionInformationBySessionIDResponse) getWebServiceTemplate()
				.marshalSendAndReceive("https://soap.placetopay.dev/placetopay", request,
						new SoapActionCallback(
							"https://api.placetopay.com/soap/placetopay#GetTransactionInformationBySessionID"));

		
		return response;
	}


	private Authentication getAuth(){

        Authentication authentication = new Authentication();

		authentication.setLogin("6dd490faf9cb87a9862245da41170ff2");
        Date now = new Date();
        SimpleDateFormat isoDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        String seed = isoDate.format(now);
        authentication.setSeed(seed);
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update((authentication.getSeed() + "iQhxZqnRbJe").getBytes("utf8"));
            authentication.setTranKey(String.format("%040x", new BigInteger(1, digest.digest())));
        } catch (Exception e) {
            e.printStackTrace();
        }

		return authentication;
	}
}
