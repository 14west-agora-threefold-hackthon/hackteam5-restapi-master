package com.agora.hackathon.team5.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agora.hackathon.team5.model.Content;

public interface ContentRepository  extends MongoRepository<Content, Long> {

	public List<Content> findByPubCode(String pubCode);

}
