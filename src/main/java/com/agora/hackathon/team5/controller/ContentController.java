package com.agora.hackathon.team5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agora.hackathon.team5.gateway.LyticsGateway;
import com.agora.hackathon.team5.model.Content;
import com.agora.hackathon.team5.model.Data;
import com.agora.hackathon.team5.service.ContentService;

@RestController
@RequestMapping(value = "/content", produces = "application/json")
public class ContentController {

	private ContentService contentService;

	private LyticsGateway lyticsGateway;

	public ContentController(ContentService contentService,LyticsGateway lyticsGateway){
		this.contentService = contentService;
		this.lyticsGateway = lyticsGateway;
	}

	@GetMapping( "/")
	public Iterable<Content> findAllContent() {
		return contentService.findAllContent();
	}

	@GetMapping( "/{pubCode}")
	public Iterable<Content> getContentByPubCode(@PathVariable String pubCode) {
		return contentService.getContentByPubCode(pubCode);
	}

	@GetMapping("/delete/all")
	public void deleteAllContent(){
		contentService.deleteAllContent();
	}

	@GetMapping("/delete/{id}")
	public void deleteContentById(@PathVariable Long id){
		contentService.deleteContentById(id);
	}

	@GetMapping("/recommend/{userId}")
	public Data getRecommendation(@PathVariable String userId){
		return lyticsGateway.getAffinityInformation(userId);
	}
}
