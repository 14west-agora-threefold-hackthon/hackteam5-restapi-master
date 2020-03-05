package com.agora.hackathon.team5.service;

import java.util.List;

import com.agora.hackathon.team5.model.Content;

public interface ContentService {

	Content getContentByPubCode(String pubCode);

	List<Content> findAllContent();

	void deleteAllContent();

	void deleteContentById(Long id);
}
