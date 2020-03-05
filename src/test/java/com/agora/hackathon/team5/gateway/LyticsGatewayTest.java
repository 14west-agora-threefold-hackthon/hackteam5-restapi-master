package com.agora.hackathon.team5.gateway;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.agora.hackathon.team5.model.Data;

@SpringBootTest
public class LyticsGatewayTest {

	@Autowired
	private LyticsGateway lyticsGateway;

	@Test
	public void retrieveRecommendationTest(){
		Data returnedData = lyticsGateway.getAffinityInformation(" 000076466861");
		System.out.println(returnedData);

	}



}
