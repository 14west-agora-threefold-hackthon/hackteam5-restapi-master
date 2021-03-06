package com.agora.hackathon.team5.gateway;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.agora.hackathon.team5.model.Data;

@Component
public class LyticsGateway {

	@Value("${lytics.gateway.endpoint}")
	String endpoint;

	RestTemplate restTemplate;

	public LyticsGateway(){
		restTemplate = new RestTemplate();
	}

	public Data getAffinityInformation(@PathVariable String userId ) {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "tKwO7ANfxlWms4b4CKGZCAxx");
		HttpEntity entity = new HttpEntity(headers);
		String finalEndpoint = endpoint + userId;
		HttpEntity<Data> response =
				restTemplate.exchange(finalEndpoint, HttpMethod.GET, entity, Data.class);

		return response.getBody();
	}
}
