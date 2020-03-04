package com.agora.hackathon.team5.model;

import org.springframework.data.annotation.Id;

public class Content {

	@Id
	private Long ID;

	private String post_title;

	private String post_content;

	private String  pub_code;

	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getPost_content() {
		return post_content;
	}

	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}

	public String getPub_code() {
		return pub_code;
	}

	public void setPub_code(String pub_code) {
		this.pub_code = pub_code;
	}

}
