package com.agora.hackathon.team5.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agora.hackathon.team5.model.Content;
import com.agora.hackathon.team5.service.ContentService;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class ContentController {

	private ContentService contentService;

	public ContentController(ContentService contentService){
		this.contentService = contentService;
	}

	@GetMapping( "/content")
	public Iterable<Content> findAllContent() {
		return contentService.findAllContent();
	}

	@GetMapping( "/content/{pubCode}")
	public Content getContentByPubCode(@PathVariable String pubCode) {
		return contentService.getContentByPubCode(pubCode);
	}

	@DeleteMapping("/delete/all")
	public void deleteAllContent(){
		contentService.deleteAllContent();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteContentById(@PathVariable Long id){
		contentService.deleteContentById(id);
	}
}
