package com.agora.hackathon.team5.service;

import java.util.List;

import com.agora.hackathon.team5.model.Content;

public interface ContentService {

	Content getContentByPubCode(String pub_code);

	List<Content> findAllContent();

}
