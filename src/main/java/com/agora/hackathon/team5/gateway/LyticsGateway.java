package com.agora.hackathon.team5.gateway;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.agora.hackathon.team5.model.Data;
import com.agora.hackathon.team5.model.Recommendation;

@RestController
@RequestMapping("/api")
public class LyticsGateway {

	@Value("${lytics.gateway.endpoint}")
	String endpoint;

	RestTemplate restTemplate;

	public LyticsGateway(){
		restTemplate = new RestTemplate();
	}

	@GetMapping("content/recommend/2419/user/user_id/{userId}")
	public Data getAffinityInformation(@PathVariable String userId ) {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "tKwO7ANfxlWms4b4CKGZCAxx");
		HttpEntity entity = new HttpEntity(headers);

		HttpEntity<Data> response =
				restTemplate.exchange(endpoint, HttpMethod.GET, entity, Data.class);

		return response.getBody();
	}
}
