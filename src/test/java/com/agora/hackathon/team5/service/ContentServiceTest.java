package com.agora.hackathon.team5.service;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.agora.hackathon.team5.model.Content;
import com.agora.hackathon.team5.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
public class ContentServiceTest {

	@Autowired
	private ContentRepository contentRepository;

	@InjectMocks
	private ContentServiceImpl contentService;

	@Test
	public void testCreateContent_invokesRepositorySave() {
		Content testContent = new Content();
		testContent.setID(1L);
		testContent.setPost_content("test post content");
		testContent.setPost_title("test post title");
		testContent.setPubCode("test pub code");

		Content saved = contentRepository.save(testContent);
		
		
		List<Content> returnedContentList = contentRepository.findAll();
		System.out.println("######### contents: " + returnedContentList.size());
		
		int numReturned = returnedContentList.size();
		Assertions.assertTrue(numReturned>=1);
	}
}
