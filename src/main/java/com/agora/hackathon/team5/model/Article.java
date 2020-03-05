package com.agora.hackathon.team5.model;

import org.springframework.data.annotation.Id;

public class Article {

	@Id
	private String id;

	private String title;

	private String featured_image;

	private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFeatured_image() {
		return featured_image;
	}

	public void setFeatured_image(String featured_image) {
		this.featured_image = featured_image;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
