package com.agora.hackathon.team5.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agora.hackathon.team5.gateway.LyticsGateway;
import com.agora.hackathon.team5.model.Content;
import com.agora.hackathon.team5.model.Recommendation;
import com.agora.hackathon.team5.service.ContentService;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class ContentController {

	private ContentService contentService;

	private LyticsGateway lyticsGateway;

	public ContentController(ContentService contentService,LyticsGateway lyticsGateway){
		this.contentService = contentService;
		this.lyticsGateway = lyticsGateway;
	}

	@GetMapping( "/content")
	public Iterable<Content> findAllContent() {
		return contentService.findAllContent();
	}

	@GetMapping( "/content/{pubCode}")
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
	public Recommendation[] getRecommendation(@PathVariable String userId){
		return lyticsGateway.getAffinityInformation(userId);
	}
}
