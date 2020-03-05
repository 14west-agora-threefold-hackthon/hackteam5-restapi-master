package com.agora.hackathon.team5.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recommendation {

	private Long id;

	private String author;

	private BigDecimal confidence;

	private String description;

	private String[] imageurls;

	private String long_description;

	private String[] path;

	private String primary_image;

	private Instant published;

	private String title;

	private HashMap<String,BigDecimal> topic_relevances;

	private String url;

	private Boolean visited;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getConfidence() {
		return confidence;
	}

	public void setConfidence(BigDecimal confidence) {
		this.confidence = confidence;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getImageurls() {
		return imageurls;
	}

	public void setImageurls(String[] imageurls) {
		this.imageurls = imageurls;
	}

	public String getLong_description() {
		return long_description;
	}

	public void setLong_description(String long_description) {
		this.long_description = long_description;
	}

	public String[] getPath() {
		return path;
	}

	public void setPath(String[] path) {
		this.path = path;
	}

	public String getPrimary_image() {
		return primary_image;
	}

	public void setPrimary_image(String primary_image) {
		this.primary_image = primary_image;
	}

	public Instant getPublished() {
		return published;
	}

	public void setPublished(Instant published) {
		this.published = published;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public HashMap<String, BigDecimal> getTopic_relevances() {
		return topic_relevances;
	}

	public void setTopic_relevances(HashMap<String, BigDecimal> topic_relevances) {
		this.topic_relevances = topic_relevances;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getVisited() {
		return visited;
	}

	public void setVisited(Boolean visited) {
		this.visited = visited;
	}
}
